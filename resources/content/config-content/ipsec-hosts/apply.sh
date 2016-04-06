#!/bin/bash

. ${CATTLE_HOME:-/var/lib/cattle}/common/scripts.sh

stage_files

if [ "$CATTLE_AGENT_STARTUP" != "true" ]; then
    reload_service net
fi
