cat << "EOF"
DROP TABLE IF EXISTS `host_vnet_map`;
DROP TABLE IF EXISTS `ip_address_nic_map`;
DROP TABLE IF EXISTS `nic`;
DROP TABLE IF EXISTS `ip_address`;
DROP TABLE IF EXISTS `subnet_vnet_map`;
DROP TABLE IF EXISTS `subnet`;
DROP TABLE IF EXISTS `vnet`;
DROP TABLE IF EXISTS `network`;
DROP TABLE IF EXISTS `resource_pool`;
EOF

. tables-common.sh

start network
bool is_public
end network

start vnet
string uri
ref network
end vnet

start subnet
string network_address
int cidr_size
string start_address
string end_address
string gateway
ref network
bool is_public
end subnet

start ip_address
string address
ref subnet
ref network
end ip_address

start nic
ref instance
ref network
ref subnet
ref vnet
int device_number
end nic

map subnet vnet

map ip_address nic
map host vnet

start resource_pool
string pool_type
bigint pool_id
string item
string owner_type
bigint owner_id
end resource_pool

cat << "EOF"
ALTER TABLE `cattle`.`resource_pool`
ADD UNIQUE `idx_pool_item` ( `pool_type` , `pool_id` , `item` );

ALTER TABLE `cattle`.`resource_pool`
ADD INDEX `idx_pool_owner` ( `pool_type` , `pool_id` , `owner_type` , `owner_id` ) COMMENT '';
EOF
