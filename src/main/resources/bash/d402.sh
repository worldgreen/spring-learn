#!/usr/bin/env bash
start=${1};
end=`date -d "${start} + 3 days" +%F`;
while [ "${start}" -lt "${end}" ]; do
echo -n "${start}";
start=`date -d "${start} + 1 days" +%F`;
done;