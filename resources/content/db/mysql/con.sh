cat << "EOF"
DROP TABLE IF EXISTS `host_ip_address_map`;
EOF

. tables-common.sh

map host ip_address
