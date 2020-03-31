#!/usr/bin/env bash
let i=1;
while [ $i -le 9 ]; do
    let j=1;
    while [ $j -le $i ]; do
        echo -n "$i*$j=$[i*j] ";
        let j=$j+1;
    done;
    let i=$i+1;
    echo -e "\n";
done;