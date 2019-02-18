#/bin/bash
find . -name ".git"|xargs rm -rf
rm -rf README.md 
git init
git pull https://github.com/manzai216/emall1.git master --allow-unrelated-histories
git remote add origin https://github.com/manzai216/emall1.git
git add -f *
git commit -m "update"
git push origin master
