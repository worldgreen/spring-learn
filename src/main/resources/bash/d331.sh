#!/usr/bin/env bash
cd ${1};
echo "${1}"
pwd;
for i in `ls`; do
    echo -n "${i} ";
done