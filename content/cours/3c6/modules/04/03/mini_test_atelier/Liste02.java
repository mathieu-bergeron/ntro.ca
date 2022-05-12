// Déclarer une variable permettant de mémoriser une liste où chaque élément est une liste de chaîne
{1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~Integer~=String~Nombre~∅}{1:MCS:=〉~∅}{1:MCS:=〉~∅} listeDeListes;

// Créer une nouvelle liste vide
listeDeListes = {1:MCS:=new~∅} {1:MCS:=ArrayList~HashList~HashMap~Collection~∅}{1:MCS:=⟨~∅}{1:MCS:=〉~∅}{1:MCS:=()~(~∅} {1:MCS:new~=∅} {1:MCS:ArrayList~HashList~HashMap~Collection~=∅}{1:MCS:⟨~=∅}{1:MCS:〉~=∅}{1:MCS:())~=∅};

// Ajouter la sous-liste ["a","b"]
{1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~Integer~=String~Nombre~∅}{1:MCS:=〉~∅}{1:MCS:=sousListe &equals;~∅}{1:MCS:=new~∅} {1:MCS:=ArrayList~HashList~HashMap~Collection~∅}{1:MCS:=⟨~∅}{1:MCS:=〉~∅}{1:MCS:=(~∅}{1:MCS:=)~∅};
{1:MCS:=sousListe~listeDeListes~∅}{1:MCS:=.add("a");~∅}
{1:MCS:=sousListe~listeDeListes~∅}{1:MCS:=.add("b");~∅}
{1:MCS:=listeDeListes~sousListe~∅}.{1:MCS:=add~insert~save~append~∅}({1:MCS:=sousListe~listeDeListes~["a","b"]~∅});

// Vérifier si une des sous-listes contient la chaîne "c"
boolean siContient = false;
for({1:MCS:=List~Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~Integer~=String~Nombre~∅}{1:MCS:=〉~∅} uneSousListe : {1:MCS:=listeDeListes~sousListe}){
    if({1:MCS:=uneSousListe~sousListe}.{1:MCS:=contains("c")~get(0)&equals;&equals;"c"}){
        siContient = true;
        break;
    }
}
