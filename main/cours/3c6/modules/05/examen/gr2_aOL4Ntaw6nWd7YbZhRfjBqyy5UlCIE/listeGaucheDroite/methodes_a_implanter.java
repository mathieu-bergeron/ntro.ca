// calcule un indice relatif à la chaîne de gauche
// à partir d'un indice relatif à la liste
int indiceGauche(int indiceListe);


// calcule un indice relatif à la liste
// à partir d'un indice relatif à la chaîne de droite
int indiceListeAPartirIndiceDroite(int indiceDroite);


// retourne un pointeur vers un élément
//
// retourne null si l'indiceListe est < 0
//
// (NOTE: doit déterminer s'il faut itérer
//        la chaîne de gauche ou 
//        la chaîne de droite)
ElementListeGaucheDroite<V> atteindreElement(int indiceListe);


// retire le premier élément de la chaîne de droite
// insère cet élément au début de la chaîne de gauche
//
// ajuste tailleGauche et tailleDroite
//
// (NOTE: doit tester pour les cas spéciaux
//        comme droite == null)
void decalerVersLaGauche();
