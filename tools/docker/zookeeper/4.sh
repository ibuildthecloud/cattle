#!/bin/bash

for IP in $(tugboat droplets | grep 'node' | sort -r | awk '{print $3}' | sed 's/,//'); do
    ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -l core $IP /bin/bash << "EOF"
    set -x
    docker rm -f $(docker ps | sed 1d | grep ibuildthecloud | awk '{print $1}')
    sudo systemctl restart docker
EOF
done
