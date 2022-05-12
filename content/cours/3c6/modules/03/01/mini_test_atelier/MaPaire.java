public class MaPaire implements {1:MCS:=Paire~Comparable~Paire, Comparable=~∅} {

	private {1:MCS:=Comparable~String~Integer~Vehicule~∅} gauche;
	private {1:MCS:=Comparable~String~Integer~Vehicule~∅} droite;

	public MaPaire({1:MCS:=Comparable~String~Integer~Vehicule~∅} gauche, {1:MCS:=Comparable~String~Integer~Vehicule~∅} droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	@Override
	public {1:MCS:Comparable~String~Integer~Vehicule~=void~∅} modifierGauche({1:MCS:=Comparable~String~Integer~Vehicule~∅} gauche) {
		this.gauche = gauche;
	}
	
	@Override
	public {1:MCS:Comparable~String~Integer~Vehicule~=void~∅} modifierDroite({1:MCS:=Comparable~String~Integer~Vehicule~∅} droite) {
		this.droite = droite;
	}
	
	@Override
	public {1:MCS:=Comparable~String~Integer~Vehicule~void~∅} obtenirGauche() {
		return gauche;
	}

	@Override
	public {1:MCS:=Comparable~String~Integer~Vehicule~void~∅} obtenirDroite() {
		return droite;
	}

	@Override
	public {1:MCS:=Comparable~String~Integer~Vehicule~void~∅} obtenirPlusPetit() {
		
		{1:MCS:=Comparable~String~Integer~Vehicule~∅} plusPetit = droite;
		
		if(gauche{1:MCS:=.compareTo~.equals~∅}({1:MCS:=droite~autre~∅}) {1:MCS:=&lt;~&gt;&equal&equal;~∅} {1:MCS:=0~∅}) {
			plusPetit = gauche;
		}
		
		return plusPetit;
	}
}
