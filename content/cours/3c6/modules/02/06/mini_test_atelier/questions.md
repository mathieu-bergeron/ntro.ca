# Re-coder les constructeurs

En choississant les bonnes options, compléter les trois constructeurs suivants, tirés de l'`atelier2_6`.

Choisir `∅` si l'option n'est pas utile.


<pre>
{1:MCS:=public~private~∅} Animal({1:MCS:=int ~String ~∅}{1:MCS:=heuresTotalesDeSommeil~nombreOiseauxAttrapes~∅}{1:MCS:, ~=∅}{1:MCS:int ~String ~=∅}{1:MCS:heuresTotalesDeSommeil~nombreOiseauxAttrapes~=∅}) {
    {1:MCS:super(heuresTotalesDeSommeil);~super(nombreOiseauxAttrapes);~=∅}
    {1:MCS:=this.heuresTotalesDeSommeil = heuresTotalesDeSommeil~∅}
    {1:MCS:this.nombreOiseauxAttrapes = nombreOiseauxAttrapes~=∅}
}

{1:MCS:=public~private~∅} Chat({1:MCS:=int ~String ~∅}{1:MCS:=heuresTotalesDeSommeil~nombreOiseauxAttrapes~∅}{1:MCS:=, ~∅}{1:MCS:=int ~String ~∅}{1:MCS:heuresTotalesDeSommeil~=nombreOiseauxAttrapes~∅}) {
    {1:MCS:=super(heuresTotalesDeSommeil);~super(nombreOiseauxAttrapes);~∅}
    {1:MCS:this.heuresTotalesDeSommeil = heuresTotalesDeSommeil~=∅}
    {1:MCS:=this.nombreOiseauxAttrapes = nombreOiseauxAttrapes~∅}
}

{1:MCS:=public~private~∅} ChatGouttiere({1:MCS:=int ~String ~∅}{1:MCS:=heuresTotalesDeSommeil~nombreOiseauxAttrapes~∅}{1:MCS:=, ~∅}{1:MCS:=int ~String ~∅}{1:MCS:heuresTotalesDeSommeil~=nombreOiseauxAttrapes~∅}) {
    {1:MCS:=super(heuresTotalesDeSommeil, nombreOiseauxAttrapes);~super(heuresTotalesDeSommeil);~super(nombreOiseauxAttrapes);~∅}
    {1:MCS:this.heuresTotalesDeSommeil = heuresTotalesDeSommeil~=∅}
    {1:MCS:this.nombreOiseauxAttrapes = nombreOiseauxAttrapes~=∅}
}
</pre>

# Re-coder l'utilisation de super

En choississant les bonnes options, compléter la méthode `Chat.formater` de l'`atelier2_6`. Choisir `∅` si l'option n'est pas utile.

De la même façon, compléter aussi une méthode `ChatPersant.formater` qui va:

* Retourner presque la même chose que `Chat.formater`, mais insérer `joli` avant `oiseaux` 
    * note: on va ignorer la faute de français

<pre>
public class Chat extends Animal {
    //...

    @Override
    public String formater(){
        StringBuilder builder = new StringBuilder();

        builder.append({1:MCS:=super.formater()~" J'ai aussi attrapé"~nombreOiseauxAttrapes~" oiseaux."~∅});
        builder.append({1:MCS:super.formater()~=" J'ai aussi attrapé"~nombreOiseauxAttrapes~" oiseaux."~∅});
        builder.append({1:MCS:super.formater()~" J'ai aussi attrapé"~=nombreOiseauxAttrapes~" oiseaux."~∅});
        builder.append({1:MCS:super.formater()~" J'ai aussi attrapé"~nombreOiseauxAttrapes~=" oiseaux."~∅});

        return builder.toString();
    }
}

public class ChatPersan extends Chat {
    //...

    @Override
    public String formater(){
        String resultat = {1:MCS:=super.formater();~" J'ai aussi attrapé" + nombreOiseauxAttrapes + " " + rendreJoli("oiseaux.");~∅}

        resultat = {1:MCS:=resultat.replace("oiseaux", rendreJoli("oiseaux"));~resultat + " J'ai aussi attrapé" + nombreOiseauxAttrapes + " " + rendreJoli("oiseaux.");~∅}

        return resultat;
    }
}
</pre>
