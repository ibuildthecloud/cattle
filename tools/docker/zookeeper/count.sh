#!/bin/bash

for IP in $(tugboat droplets | grep 'node' | grep -v 'sfo1-node1' | awk '{print $3}' | sed 's/,//'); do
    ssh -o UserKnownHostsFile=/dev/null -o StrictHostKeyChecking=no -l core $IP /bin/bash 2>/dev/null << "EOF"
    hostname
    uptime
    docker ps -q | wc -l
EOF
done
