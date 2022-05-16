// calcule un indice relatif à la chaîne de droite
// à partir d'un indice relatif à la liste
int indiceDroite(int indiceListe);


// calcule un indice relatif à la liste
// à partir d'un indice relatif à la chaîne de gauche
int indiceListeAPartirIndiceGauche(int indiceGauche);


// retourne un pointeur vers un élément
//
// retourne null si l'indiceListe est < 0
//
// (NOTE: doit déterminer s'il faut itérer
//        la chaîne de gauche ou 
//        la chaîne de droite)
ElementListeGaucheDroite<V> atteindreElement(int indiceListe);


// retire le premier élément de la chaîne de gauche
// insère cet élément au début de la chaîne de droite
//
// ajuste tailleGauche et tailleDroite
//
// (NOTE: doit tester pour les cas spéciaux
//        comme gauche == null)
void decalerVersLaDroite();
