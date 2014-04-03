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
end subnet

start ip_address
string address
ref subnet
ref network
end ip_address

map instance network
map subnet vnet
