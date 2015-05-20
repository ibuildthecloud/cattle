from cattle import ApiError

from common_fixtures import *  # NOQA


def _create_virtual_machine(client, context, **kw):
    args = {
        'accountId': context.project.id,
        'imageUuid': context.image_uuid,
    }
    args.update(kw)

    return client.create_virtual_machine(**args)


@pytest.fixture(scope='module')
def network(context):
    return context.nsp.network()


@pytest.fixture(scope='module')
def subnet(network):
    return network.subnets()[0]


def test_virtual_machine_create_cpu_memory(super_client, context):
    vm = _create_virtual_machine(super_client, context,
                                 vcpu=2, memoryMb=42)

    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    assert vm.vcpu == 2
    assert vm.memoryMb == 42


def test_virtual_machine_create(super_client, context):
    vm = _create_virtual_machine(super_client, context)

    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    assert vm.vcpu is None
    assert vm.memoryMb is None


def test_virtual_machine_create_null_network_id(super_client, context):
    image_uuid = context.image_uuid
    try:
        super_client.create_virtual_machine(imageUuid=image_uuid,
                                            networkIds=[None])
        assert False
    except ApiError as e:
        assert e.error.code == 'NotNullable'


def test_virtual_machine_n_ids_s_ids(super_client, context,
                                     network, subnet):
    image_uuid = context.image_uuid
    try:
        super_client.create_virtual_machine(imageUuid=image_uuid,
                                            networkIds=[network.id],
                                            subnetIds=[subnet.id])
    except ApiError as e:
        assert e.error.code == 'NetworkIdsSubnetIdsMutuallyExclusive'


def test_virtual_machine_network(super_client, context, network, subnet):
    subnet_plain_id = get_plain_id(super_client, subnet)
    vm = _create_virtual_machine(super_client, context,
                                 networkIds=[network.id])

    vm = super_client.wait_success(vm)
    assert vm.state == 'running'
    assert 'networkIds' not in vm

    nics = vm.nics()
    assert len(nics) == 1

    nic = nics[0]

    assert nic.network().id == network.id
    assert nic.state == 'active'
    assert nic.macAddress is not None
    assert nic.macAddress.startswith(network.macPrefix)

    nic_admin = super_client.reload(nic)
    vm_admin = super_client.reload(vm)

    assert nic_admin.account().id == vm_admin.accountId

    ips = nic.ipAddresses()

    assert len(ips) == 1
    assert super_client.reload(nic).ipAddressNicMaps()[0].state == 'active'

    ip = ips[0]
    ip_admin = super_client.reload(ip)

    assert ip_admin.account().id == vm_admin.accountId
    assert ip_admin.subnet().id == nic_admin.subnet().id
    assert ip_admin.role == 'primary'

    assert ip.address is not None
    assert ip.address.startswith('10.42')

    assert vm.primaryIpAddress is not None
    assert vm.primaryIpAddress == ip.address

    addresses = super_client.list_resource_pool(poolType='subnet',
                                                poolId=subnet_plain_id)
    assert ip.address in [x.item for x in addresses]


def test_virtual_machine_subnet(super_client, context, subnet):
    network = subnet.network()
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])

    vm = super_client.wait_success(vm)
    assert vm.state == 'running'
    assert 'subnetIds' not in vm

    nics = vm.nics()
    assert len(nics) == 1

    nic = nics[0]

    assert nic.subnetId == subnet.id
    assert nic.network().id == network.id
    assert nic.state == 'active'

    ips = nic.ipAddresses()

    assert len(ips) == 1

    ip = ips[0]

    assert ip.address is not None
    assert ip.address.startswith('10.42')

    assert vm.primaryIpAddress is not None
    assert vm.primaryIpAddress == ip.address


def test_virtual_machine_no_ip(super_client, context):
    network = super_client.create_network()
    subnet = super_client.create_subnet(networkAddress='192.168.0.0',
                                        isPublic=True,
                                        cidrSize='16',
                                        networkId=network.id,
                                        startAddress='192.168.0.3',
                                        endAddress='192.168.0.3')
    subnet = super_client.wait_success(subnet)
    assert subnet.state == 'active'
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])

    vm = super_client.wait_success(vm)

    assert vm.state == 'running'
    assert vm.primaryIpAddress == '192.168.0.3'

    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])
    vm = super_client.wait_transitioning(vm)

    assert vm.state == 'removed'
    assert vm.transitioning == 'error'
    assert vm.transitioningMessage == \
        'Failed to allocate IP from subnet : IP allocation error'


def test_virtual_machine_stop_subnet(super_client, context, subnet):
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])
    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1
    assert vm.nics()[0].ipAddresses()[0].address.startswith('10.42')

    vm = super_client.wait_success(vm.stop())

    assert vm.state == 'stopped'

    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1

    nic = vm.nics()[0]
    ip_address = nic.ipAddresses()[0]

    assert ip_address.state == 'active'
    assert ip_address.address.startswith('10.42')
    assert nic.state == 'inactive'


def test_virtual_machine_remove_subnet(super_client, context, subnet):
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])
    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1
    assert vm.nics()[0].ipAddresses()[0].address.startswith('10.42')

    vm = super_client.wait_success(vm.stop(remove=True))

    assert vm.state == 'removed'

    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1

    nic = vm.nics()[0]
    ip_address = nic.ipAddresses()[0]

    assert ip_address.state == 'active'
    assert ip_address.address.startswith('10.42')
    assert nic.state == 'removed'


def test_virtual_machine_purge_subnet(super_client, context, subnet):
    subnet_plain_id = get_plain_id(super_client, subnet)
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])
    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    addresses = super_client.list_resource_pool(poolType='subnet',
                                                poolId=subnet_plain_id)
    assert vm.primaryIpAddress in [x.item for x in addresses]
    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1
    assert vm.nics()[0].ipAddresses()[0].address.startswith('10.42')

    vm = super_client.wait_success(vm.stop(remove=True))

    assert vm.state == 'removed'

    assert len(vm.nics()) == 1
    assert len(vm.nics()[0].ipAddresses()) == 1

    nic = vm.nics()[0]
    ip_address = nic.ipAddresses()[0]

    assert ip_address.state == 'active'
    assert ip_address.address.startswith('10.42')
    assert nic.state == 'removed'

    vm = super_client.wait_success(vm.purge())
    assert vm.state == 'purged'

    nics = vm.nics()
    assert len(nics) == 1

    nic = nics[0]
    assert nic.state == 'removed'
    assert nic.macAddress is not None

    nic = super_client.wait_success(nic.purge())
    assert nic.state == 'purged'
    assert nic.macAddress is None

    assert len(nic.ipAddressNicMaps()) == 1
    assert nic.ipAddressNicMaps()[0].state == 'removed'
    assert len(nic.ipAddresses()) == 0

    ip_address = super_client.reload(ip_address)
    assert ip_address.state == 'removed'
    assert ip_address.address is not None
    addresses = super_client.list_resource_pool(poolType='subnet',
                                                poolId=subnet_plain_id)
    assert vm.primaryIpAddress not in [x.item for x in addresses]


def test_virtual_machine_restore_subnet(super_client, context, subnet):
    subnet_plain_id = get_plain_id(super_client, subnet)
    vm = _create_virtual_machine(super_client, context,
                                 subnetIds=[subnet.id])
    vm = super_client.wait_success(vm)
    assert vm.state == 'running'

    addresses = super_client.list_resource_pool(poolType='subnet',
                                                poolId=subnet_plain_id)

    assert vm.primaryIpAddress in [x.item for x in addresses]
    vm = super_client.wait_success(vm.stop())
    assert vm.state == 'stopped'

    vm = super_client.wait_success(super_client.delete(vm))
    assert vm.state == 'removed'

    assert vm.state == 'removed'
    nic = vm.nics()[0]
    ip_address = nic.ipAddresses()[0]
    address = ip_address.address
    assert ip_address.address.startswith('10.42')

    vm = vm.restore()
    assert vm.state == 'restoring'

    vm = super_client.wait_success(vm)
    assert vm.state == 'stopped'

    assert len(vm.nics()) == 1
    nic = vm.nics()[0]
    assert nic.state == 'inactive'

    assert len(nic.ipAddresses()) == 1
    ip_address = nic.ipAddresses()[0]
    assert ip_address.state == 'active'

    vm = super_client.wait_success(vm.start())

    assert vm.state == 'running'
    assert vm.nics()[0].ipAddresses()[0].address == address


def test_virtual_machine_console(super_client, context):
    vm = _create_virtual_machine(super_client, context)
    vm = super_client.wait_success(vm)

    assert vm.state == 'running'
    assert 'console' not in vm

    vm = super_client.update(vm, data={
        'fields': {
            'capabilities': ['console']
        }
    })

    assert 'console' in vm
    assert 'console' in vm and callable(vm.console)

    console = vm.console()

    assert console is not None
    assert console.kind == 'fake'
    assert console.url == 'http://localhost/console'


def test_virtual_machine_console_visibility(super_client, context):
    vm = _create_virtual_machine(super_client, context)
    vm = super_client.wait_success(vm)

    assert vm.state == 'running'
    assert 'console' not in vm

    vm = super_client.update(vm, data={
        'fields': {
            'capabilities': ['console']
        }
    })

    assert 'console' in vm
    assert 'console' in vm and callable(vm.console)

    vm = super_client.wait_success(vm.stop())

    assert vm.state == 'stopped'
    assert 'console' not in vm
