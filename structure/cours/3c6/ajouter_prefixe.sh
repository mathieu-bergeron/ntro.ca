ag -gmd$ | while read i;
do
    if [ "$i" != "prefixe.md" -a "$i" != "tmp.md" ]; then
        cat prefixe.md > tmp.md
        cat $i >> tmp.md
        mv -v tmp.md $i
    fi
done
