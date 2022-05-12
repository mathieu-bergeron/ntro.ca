package tutoriels.generer_atelier4_4.solution;

import java.io.IOException;
import java.io.RandomAccessFile;

import tutoriels.generer_tutoriel4_4.solution.ManipulateurDeFichierAbstrait;

public class ManipulateurDeFichierEfficace extends ManipulateurDeFichierAbstrait {

	@Override
	public void modifierFichier(int indice, double nouvelleValeur, String nomFichier) throws IOException {
		int tailleValeur = formaterDouble(0).getBytes().length;
		int tailleSeparateur = System.lineSeparator().getBytes().length;
		int tailleUneLigne = tailleValeur + tailleSeparateur;
		long emplacement = tailleUneLigne * indice;
		
		RandomAccessFile fichier = new RandomAccessFile(nomFichier, "rw");
		fichier.seek(emplacement);
		fichier.write(formaterDouble(nouvelleValeur).getBytes());

		fichier.close();
	}
}
