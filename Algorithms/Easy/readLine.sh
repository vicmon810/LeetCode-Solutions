# Read from the file file.txt and output the tenth line to stdout.

#!/bin/bash
filename="file.txt"
if [ $(wc -l < "$filename") -ge 10 ]; then
    head -n 10 "$filename" | tail -n 1
fi
