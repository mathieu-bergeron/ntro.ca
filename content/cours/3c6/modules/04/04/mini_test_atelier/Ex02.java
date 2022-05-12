public void modifierFichier(int indice, 
                            String nouvelleCle, 
                            double nouvelleValeur, 
                            String nomFichier) throws IOException {

	int tailleOuverture = "  {1:MCS:\"~=∅}{1:MCS:=&rbrace;~\n&rbrace;~&rbrace;&rbrace;~∅}{1:MCS:\"~=∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleCle = "  {1:MCS:=\"~∅}{1:MCS:=cle01~cle~5~∅}{1:MCS:=\"~∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleValeur = {1:MCS:=formaterDouble~"0"~∅}{1:MCS:=(0)~("00.00")~∅}{1:MCS:=.getBytes().length~.length()~∅};
	int tailleSeparateurCleValeur = "{1:MCS:\"~=∅}{1:MCS:=,~  ,~,,~∅}{1:MCS:\"~=∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleSeparateurPaires = "{1:MCS:\"~=∅}{1:MCS:=:~  :~::~∅}{1:MCS:\"~=∅}  "{1:MCS:=.getBytes().length~.length()~∅};
	int tailleUnEmplacement = {1:MCS:tailleOuverture~=∅} {1:MCS:+~=∅} {1:MCS:=tailleCle~∅} {1:MCS:=+~∅}
	                          {1:MCS:=tailleSeparateurCleValeur~∅} {1:MCS:=+~∅} {1:MCS:=tailleValeur~∅} {1:MCS:=tailleSeparateurPaires~∅};

	long emplacement = {1:MCS:=tailleOuverture~∅} {1:MCS:=+~*~∅} {1:MCS:=tailleUnEmplacement~∅} {1:MCS:=*~+~∅} {1:MCS:=indice~∅};
	
	RandomAccessFile fichier = new RandomAccessFile(nomFichier, "rw");
	fichier.seek({1:MCS:=emplacement~tailleOuverture~tailleSeparateur~tailleValeur~tailleUnEmplacement~indice~∅});

    String aEcrire = {1:MCS:="\""~∅} {1:MCS:=+~∅} nouvelleCle {1:MCS:=+~∅} {1:MCS:"\""~="\":"~∅} + {1:MCS:=formaterDouble~"0"~∅}{1:MCS:=(nouvelleValeur)~(""+nouvelleValeur)~(0)~∅};

	fichier.write(aEcrire.getBytes());

	fichier.close();
}
