Noeud<Integer> racine = new MonNoeud<Integer>(3);

Noeud<Integer> gauche = new MonNoeud<Integer>(1);
Noeud<Integer> droite = new MonNoeud<Integer>(5);

Noeud<Integer> gaucheGauche = new MonNoeud<Integer>(0);
Noeud<Integer> gaucheDroite= new MonNoeud<Integer>(2);

Noeud<Integer> droiteGauche = new MonNoeud<Integer>(4);
Noeud<Integer> droiteDroite= new MonNoeud<Integer>(6);

racine.setEnfantGauche(gauche);
racine.setEnfantDroit(droite);

gauche.setEnfantGauche(gaucheGauche);
gauche.setEnfantDroit(gaucheDroite);

droite.setEnfantGauche(droiteGauche);
droite.setEnfantDroit(droiteDroite);
