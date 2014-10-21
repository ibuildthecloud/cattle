#!/bin/bash

echo 'Creating' $(cattle list-container --state=creating | grep uuid | wc -l)
echo 'Starting' $(cattle list-container --state=starting | grep uuid | wc -l)

