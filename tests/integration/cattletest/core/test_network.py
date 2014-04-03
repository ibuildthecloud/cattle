from common_fixtures import *  # NOQA


@pytest.fixture(scope='module')
def network(admin_client):
    return admin_client.wait_success(admin_client.create_network())


def test_network_create_defaults(admin_client):
    network = admin_client.create_network()

    assert network.state == 'registering'
    assert not network.isPublic

    network = admin_client.wait_success(network)

    assert network.state == 'active'


def test_network_create(admin_client):
    network = admin_client.create_network(isPublic=True)

    assert network.state == 'registering'
    assert network.isPublic

    network = admin_client.wait_success(network)
    assert network.state == 'active'

    return network


def test_subnet_create(admin_client, network):
    subnet = admin_client.create_subnet(networkAddress='192.168.0.0',
                                        cidrSize='24',
                                        networkId=network.id)

    assert subnet.state == 'registering'
    assert subnet.networkAddress == '192.168.0.0'
    assert subnet.cidrSize == 24
    assert subnet.gateway is None
    assert subnet.startAddress is None
    assert subnet.endAddress is None
    assert 'networkId' not in subnet

    subnet = admin_client.wait_success(subnet)

    assert subnet.state == 'active'
    assert subnet.networkAddress == '192.168.0.0'
    assert subnet.cidrSize == 24
    assert subnet.gateway == '192.168.0.1'
    assert subnet.startAddress == '192.168.0.2'
    assert subnet.endAddress == '192.168.0.250'
