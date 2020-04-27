#!/usr/bin/env bash
if pwd; then
    echo 'ok';
else
    echo "not ok"
fi;
num1=1
num2=2
if [ $num1 -eq $num2 ]; then
   echo "num1 == num2";
elif [ $num1 -lt $num2 ]; then
   echo " num1 < num2 ";
else
   echo " num1 > num2 ";
fi;
