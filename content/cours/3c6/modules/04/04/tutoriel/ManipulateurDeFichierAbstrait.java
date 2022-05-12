public class ManipulateurDeFichierAbstrait implements ManipulateurDeFichier {

	@Override
	public String formaterDouble(double valeur) {
		return String.format("%05.2f",valeur);
	}

	@Override
	public void ecrireFichier(List<Double> valeurs, String nomFichier) throws IOException {
		File fichier = new File(nomFichier);
		OutputStream out = new FileOutputStream(fichier);
		
		for(int i = 0; i < valeurs.size(); i++) {
			out.write(formaterDouble(valeurs.get(i)).getBytes());
			out.write(System.lineSeparator().getBytes());
		}

		out.close();
	}


	@Override
	public List<Double> lireFichier(String nomFichier) throws IOException {
		List<Double> listeValeurs = new ArrayList<>();
		File fichier = new File(nomFichier);
		InputStream in = new FileInputStream(fichier);
		Scanner scanner = new Scanner(in);
		
		while(scanner.hasNext()) {
			listeValeurs.add(scanner.nextDouble());
		}
		scanner.close();
		
		return listeValeurs;
	}
}
