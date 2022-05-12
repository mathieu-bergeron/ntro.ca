// Déclarer une variable pour mémoriser un map
// où les clés sont des chaînes et les valeurs des listes d'entiers
Map<String,List<Integer>> mapDeListes;

{1:MCS:List~=Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~Integer~=String~Nombre~∅}{1:MCS:=,~∅}{1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~=Integer~String~Nombre~∅}{1:MCS:=〉~∅}{1:MCS:=〉~∅} mapDeListes;

// Créer un nouveau map vide
mapDeListes = {1:MCS:=new~∅} {1:MCS:ArrayList~HashList~=HashMap~Collection~∅}{1:MCS:=⟨~∅}{1:MCS:=〉~∅}{1:MCS:=(~∅}{1:MCS:=)~∅};

// Ajouter la liste [4,5,1] pour la clé "4fds"
{1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~Integer~=String~Nombre~∅}{1:MCS:=〉~∅}{1:MCS:=sousListe &equals;~∅}{1:MCS:=new~∅} {1:MCS:=ArrayList~HashList~HashMap~Collection~∅}{1:MCS:=⟨~∅}{1:MCS:=〉~∅}{1:MCS:=(~∅}{1:MCS:=)~∅};
{1:MCS:=sousListe~listeDeListes~∅}{1:MCS:=.add(4);~∅}
{1:MCS:=sousListe~listeDeListes~∅}{1:MCS:=.add(5);~∅}
{1:MCS:=sousListe~listeDeListes~∅}{1:MCS:=.add(1);~∅}
{1:MCS:=mapDeListes~sousListe~∅}.{1:MCS:=put~add~insert~save~∅}({1:MCS:="4fsd"~∅}{1:MCS:=,~∅}{1:MCS:=sousListe~[4,5,1]~&#123;"4fsd":[4,5,1]&#125; ~∅});

// Vérifier si le map contient une liste contenant la valeur 3
boolean siContient = false;
for({1:MCS:=String~Integer~List⟨〉~∅} cle : mapDeListes.keySet()){
    {1:MCS:=List⟨Integer〉~String~Integer~∅} uneSousListe = mapDeListes.{1:MCS:=get~obtain~retrieve~extract~∅}(cle);
    if(uneSousListe.{1:MCS:=contains~hasKey~containsKey~containsValue~∅}({1:MCS:=3~1~2~4~∅})){
        siContient = true;
        break;
    }
}
