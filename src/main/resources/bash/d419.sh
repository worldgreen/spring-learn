#!/usr/bin/env bash
cat file.txt | awk'
{
    for(i=1; i <= NF; i++){
        data[i] = ((i in data) ? : data[i] " " : "") $i
    }
} END {
    for(i in data) {
        print data[i]
    }
}'