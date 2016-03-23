#!/bin/sh
git pull origin master
now="$(date): update all by Alan Sii Hee Kwong @AlanLZY"

git add -A README.md
git add -A */
git add -A update.sh

git commit -m "$now"
git push origin master