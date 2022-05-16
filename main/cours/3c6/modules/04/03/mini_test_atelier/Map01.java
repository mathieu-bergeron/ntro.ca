// Déclarer une variable pour mémoriser un map
// où les clés sont des entiers et les valeurs des Autos
{1:MCS:List~=Map~∅}{1:MCS:=⟨~∅}{1:MCS:Double~=Integer~String~Nombre~Auto~∅}{1:MCS:=,~∅}{1:MCS:Double~Integer~String~Nombre~=Auto~∅}{1:MCS:=〉~∅} lesAutos;

// Créer un nouveau map vide
lesAutos = {1:MCS:=new~∅} {1:MCS:ArrayList~HashList~=HashMap~Collection~∅}{1:MCS:=⟨~∅}{1:MCS:=〉~∅}{1:MCS:=(~∅}{1:MCS:=)~∅};

// Ajouter une nouvelle auto avec l'identifiant 1231
{1:MCS:=Auto~Integer~Object~∅} {1:MCS:=auto1~∅} {1:MCS:=&equals;~∅} {1:MCS:=new~∅} {1:MCS:=Auto~Integer~Object~∅}{1:MCS:⟨~=∅}{1:MCS:〉~=∅}{1:MCS:=(~∅}{1:MCS:=)~∅};
lesAutos.{1:MCS:=put~add~insert~save~∅}({1:MCS:=1231~auto01~∅}, {1:MCS:=auto01~Auto.class~1231~∅});

// Ajouter une nouvelle auto avec l'identifiant 5644
{1:MCS:=Auto~Integer~Object~∅} {1:MCS:=auto02~∅} {1:MCS:=&equals;~∅} {1:MCS:=new~∅} {1:MCS:=Auto~Integer~Object~∅}{1:MCS:⟨~=∅}{1:MCS:〉~=∅}{1:MCS:=(~∅}{1:MCS:=)~∅};
lesAutos.{1:MCS:=put~add~insert~save~∅}({1:MCS:=5644~auto02~∅}, {1:MCS:=auto02~Auto.class~5644~∅});

// Retirer la deuxième auto
lesAutos.{1:MCS:=remove~clear~delete~forget~∅}({1:MCS:=5644~auto01~auto02~∅});

// Vérifier si le map contient une auto avec l'identifiant 9482
{1:MCS:=boolean~Auto~Integer~∅} siContient = lesAutos.{1:MCS:=containsKey~containsValue~exists~∅}({1:MCS:=9482~auto02~auto01~∅});
