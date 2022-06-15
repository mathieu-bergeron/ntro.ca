public void modifierFichier(int indice, 
                            String nouvelleValeur, 
                            String nomFichier) throws IOException {

	int tailleOuverture = "  {1:MCS:\"~=∅}{1:MCS:=[~\n[~[[~∅}{1:MCS:\"~=∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleValeur = "  {1:MCS:=\"~∅}{1:MCS:=aaaa~aa~4~∅}{1:MCS:=\"~∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleSeparateur = "{1:MCS:\"~=∅}{1:MCS:=,~  ,~,,~∅}{1:MCS:\"~=∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleUnEmplacement = {1:MCS:tailleOuverture~=∅} {1:MCS:+~=∅} {1:MCS:=tailleValeur~∅} {1:MCS:=+~∅} {1:MCS:=tailleSeparateur~∅};
	long emplacement = {1:MCS:=tailleOuverture~∅} {1:MCS:=+~*~∅} {1:MCS:=tailleUnEmplacement~∅} {1:MCS:=*~+~∅} {1:MCS:=indice~∅};
	
	RandomAccessFile fichier = new RandomAccessFile(nomFichier, "rw");
	fichier.seek({1:MCS:=emplacement~tailleOuverture~tailleSeparateur~tailleValeur~tailleUnEmplacement~indice~∅});

    String aEcrire = {1:MCS:="\""~∅} {1:MCS:=+~∅} nouvelleValeur {1:MCS:=+~∅} {1:MCS:="\""~∅};

	fichier.write(aEcrire{1:MCS:=.getBytes()~∅});

	fichier.close();
}
