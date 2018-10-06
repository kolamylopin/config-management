#!/bin/sh

path="$1"
cmd="$2"

until $(curl --output /dev/null --silent --head --fail $path); do
    printf "waiting for config server $path\n"
    sleep 5
done

echo "running cmd $cmd"
eval $cmd