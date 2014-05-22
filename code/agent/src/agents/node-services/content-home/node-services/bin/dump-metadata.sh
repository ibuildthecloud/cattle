#!/bin/bash

START=${START:-"http://169.254.169.254"}

recurse()
{
	local content=$(curl -s $1)

	for i in $content; do
		case $i in
		meta-data|dynamic)
			recurse ${1}${i}/
			;;
		*/)
			recurse ${1}${i}
			;;
		*)
			local data="$(curl -s ${1}${i})"
			if [[ $data =~ "404 - Not Found" ]]; then
				echo ${1}${i} '='
			else
				echo ${1}${i} '=' $(curl -s ${1}${i})
			fi
			;;
		esac
	done
}

for j in $(curl -s $START); do
	recurse ${START}/$j/
done
