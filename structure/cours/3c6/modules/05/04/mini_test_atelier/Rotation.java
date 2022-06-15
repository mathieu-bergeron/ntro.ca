private void rotationGaucheDroite(){
	C prochaineValeurRacine = {1:MCS:=enfantGauche()~enfantDroit()~parent()~∅}{1:MCS:.enfantGauche()~.enfantDroit()~.parent()~=∅}{1:MCS:=.~∅}{1:MCS:=valeur()~∅};
	C prochaineValeurDroite = {1:MCS:enfantGauche()~enfantDroit()~parent()~=∅}{1:MCS:.enfantGauche()~.enfantDroit()~.parent()~=∅}{1:MCS:.~=∅}{1:MCS:=valeur()~∅};
	Noeud<C> prochainEnfantGauche = {1:MCS:=enfantGauche()~enfantDroit()~parent()~∅}{1:MCS:=.enfantGauche()~.enfantDroit()~.parent()~∅};
	Noeud<C> prochainEnfantDroiteGauche = {1:MCS:=enfantGauche()~enfantDroit()~parent()~∅}{1:MCS:.enfantGauche()~=.enfantDroit()~.parent()~∅};
	Noeud<C> prochainEnfantDroiteDroite = {1:MCS:enfantGauche()~=enfantDroit()~parent()~∅}{1:MCS:.enfantGauche()~.enfantDroit()~.parent()~=∅};
	
	setValeur({1:MCS:=prochaineValeurRacine~prochaineValeurDroite~prochainEnfantGauche.valeur()~prochainEnfantDroiteGauche.valeur()~prochainEnfantDroiteDroite.valeur()});
	setEnfantDroit(nouveauNoeud({1:MCS:prochaineValeurRacine~=prochaineValeurDroite~prochainEnfantGauche.valeur()~prochainEnfantDroiteGauche.valeur()~prochainEnfantDroiteDroite.valeur()}, {1:MCS:=this~prochainEnfantGauche~prochainEnfantDroiteGauche~prochainEnfantDroiteDroite}));
	setEnfantGauche({1:MCS:this~=prochainEnfantGauche~prochainEnfantDroiteGauche~prochainEnfantDroiteDroite});
	if(enfantGauche() != null) {
		enfantGauche().setParent({1:MCS:=this~prochainEnfantGauche~prochainEnfantDroiteGauche~prochainEnfantDroiteDroite});
	}

	enfantDroit().setEnfantGauche({1:MCS:this~prochainEnfantGauche~=prochainEnfantDroiteGauche~prochainEnfantDroiteDroite~enfantDroit()~enfantGauche()});
	if(enfantDroit().enfantGauche() != null) {
		enfantDroit().enfantGauche().setParent({1:MCS:this~prochainEnfantGauche~=prochainEnfantDroiteGauche~prochainEnfantDroiteDroite~=enfantDroit()~enfantGauche()});
	}

	enfantDroit().setEnfantDroit({1:MCS:this~prochainEnfantGauche~prochainEnfantDroiteGauche~=prochainEnfantDroiteDroite~enfantDroit()~enfantGauche()});
	if(enfantDroit().enfantDroit() != null) {
		enfantDroit().enfantDroit().setParent({1:MCS:this~prochainEnfantGauche~prochainEnfantDroiteGauche~prochainEnfantDroiteDroite~=enfantDroit()~enfantGauche()});
	}
}
