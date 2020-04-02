#!/usr/bin/env bash
cd ${1}
for i in `ls`; do
    if [ -f ${i} ];
    then echo " ${i} is a file ";
    else echo " ${i} is not a file ";
    fi;
done;