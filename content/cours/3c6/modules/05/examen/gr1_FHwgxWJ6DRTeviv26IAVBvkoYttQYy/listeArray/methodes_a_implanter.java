// retourne la taille de la liste
// (se calcule avec indicePremierElement et indiceDernierElement )
int size();


// calcule un indice relatif au gros tableau 
// à partir d'un indice relatif à la liste
int indiceGrosTableau(int indiceListe);


// décide s'il faut agrandir le gros tableau
boolean doitAgrandir();


// décale à gauche tous les éléments du gros tableau
// à partir de indiceDebut (inclusivement) 
// jusqu'à indiceFin (inclusivement)
//
// (on présume au moins une case libre à gauche dans le gros tableau)
void decalerAGauche(int indiceDebut, int indiceFin);


// décale les éléments à gauche d'une façon 
// à retirer l'élément correspondant à indiceListe
//
// ajuste ensuite indicePremierElement et/ou indiceDernierElement
//
// (NOTE: doit convertir indiceListe en indiceGrosTableau)
void remove(int indiceListe);


// décale les éléments à gauche d'une 
// façon à créer un espace où insérer la valeur
//
// insère la valeur dans le grosTableau
//
// ajuste ensuite indicePremierElement et/ou indiceDernierElement
//
// (NOTE: doit convertir indiceListe en indiceGrosTableau)
void insert(int indiceListe, V valeur);
