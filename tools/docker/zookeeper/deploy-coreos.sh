#!/bin/bash


SCRIPT=https://raw.githubusercontent.com/ibuildthecloud/coreos-on-do/master/coreos-on-do.sh
NYC=https://gist.githubusercontent.com/ibuildthecloud/9631e95a3ca36f652a41/raw/f5572cf935314c7faf92a13ef6170f5d3408db4b/gistfile1.txt
SFO=https://gist.githubusercontent.com/ibuildthecloud/43184dfe5ccc606f4897/raw/f0423b491b9677a1ce7a1636a5fe24742d05a3d0/gistfile1.txt

for IP in $(<ips); do
    curl -sL $SCRIPT | ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -l root $IP CHANNEL=alpha CLOUD_CONFIG=$SFO bash
done
