#!/usr/bin/env bash
seq9=`seq 9`
for i in ${seq9};
    do for j in $(seq $i);
        do echo -n "$i*$j=$((i*j)) ";
        done;
    echo -e "\n"
done;