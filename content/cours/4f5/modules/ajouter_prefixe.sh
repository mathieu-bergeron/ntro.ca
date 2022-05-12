ag -gmd$ | while read i;
do
    cat prefixe.md > tmp.md
    cat $i >> tmp.md
    mv -v tmp.md $i
done
