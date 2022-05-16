public class MaPaire {1:MCS:=&lt;~∅}{1:MCS:=C~∅}{1:MCS:=extends~∅}{1:MCS:=Comparable~∅}{1:MCS:=&lt;~∅}{1:MCS:=C~∅}{1:MCS:=&gt;~∅}{1:MCS:=&gt;~∅} implements Paire {1:MCS:=&lt;~∅}{1:MCS:=C~Comparable~C extends Comparable~∅}{1:MCS:=&gt;~∅} {

	private {1:MCS:=C~Comparable~String~Integer~∅} gauche;
	private {1:MCS:=C~Comparable~String~Integer~∅} droite;

	public MaPaire({1:MCS:=C~Comparable~String~Integer~∅} gauche, {1:MCS:=C~Comparable~String~Integer~∅} droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	@Override
	public {1:MCS:C~Comparable~String~Integer~=void~∅} modifierGauche({1:MCS:=C~Comparable~String~Integer~∅} gauche) {
		this.gauche = gauche;
	}
	
	@Override
	public {1:MCS:C~Comparable~String~Integer~=void~∅} modifierDroite({1:MCS:=C~Comparable~String~Integer~∅} droite) {
		this.droite = droite;
	}
	
	@Override
	public {1:MCS:=C~Comparable~String~Integer~void~∅} obtenirGauche() {
		return gauche;
	}

	@Override
	public {1:MCS:=C~Comparable~String~Integer~void~∅} obtenirDroite() {
		return droite;
	}

	@Override
	public {1:MCS:=C~Comparable~String~Integer~void~∅} obtenirPlusPetit() {
		
		{1:MCS:=C~Comparable~String~Integer~∅} plusPetit = droite;
		
		if(gauche{1:MCS:=.compareTo~.equals~∅}({1:MCS:=droite~autre~∅}) {1:MCS:=&lt;~&gt;&equal&equal;~∅} {1:MCS:=0~∅}) {
			plusPetit = gauche;
		}
		
		return plusPetit;
	}
}
