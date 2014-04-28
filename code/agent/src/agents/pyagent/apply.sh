#!/bin/bash
set -e

trap cleanup EXIT

cleanup()
{
    local exit=$?

    if [ -e $TEMP ]; then
        rm -rf $TEMP
    fi
    if [ -e $OLD ]; then
        rm -rf $OLD
    fi

    return $exit
}

source ${CATTLE_HOME:-/var/lib/cattle}/common/scripts.sh

DEST=$CATTLE_HOME/pyagent
MAIN=$DEST/main.py
STAMP=$CATTLE_HOME/.pyagent-stamp
OLD=$(mktemp -d ${DEST}.XXXXXXXX)
TEMP=$(mktemp -d ${DEST}.XXXXXXXX)

cd $(dirname $0)

stage()
{
    cp -rf apply.sh cattle dist main.py $TEMP
    
    find $TEMP -name "*.sh" -exec chmod +x {} \;
    find $TEMP \( -name nsenter -o -name socat \) -exec chmod +x {} \;

    if [ -e $DEST ]; then
        mv $DEST ${OLD}
    fi
    mv $TEMP ${DEST}
    rm -rf ${OLD}

    echo $RANDOM > $STAMP
}

conf()
{
    CONF=(/var/lib/cattle/pyagent/agent.conf
          /etc/cattle/agent/agent.conf
          /var/lib/cattle/etc/cattle/agent/agent.conf)

    for conf_file in "${CONF[@]}"; do
        if [ -e $conf_file ]
        then
            source $conf_file
        fi
    done
}

start()
{
    if [ -n "$NO_START" ]; then
        return 0
    fi
    chmod +x $MAIN
    if [ "$CATTLE_PYPY" = "true" ] && which pypy >/dev/null; then
        MAIN="pypy $MAIN"
    fi
    if [ "$DAEMON" = false ]; then
        info Executing $MAIN
        cleanup
        exec $MAIN
    else
        info Backgrounding $MAIN
        $MAIN &
    fi
}

while [ "$#" -gt 0 ]; do
    case $1 in
    --no-start)
        NO_START=true
        ;;
    --no-daemon)
        DAEMON=false
        ;;
    start)
        start
        exit 0
        ;;
    esac
    shift 1
done

conf
stage
