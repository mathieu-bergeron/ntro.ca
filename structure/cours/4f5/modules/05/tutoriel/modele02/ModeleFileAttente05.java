public class ModeleFileAttente implements Model {
	
	// ...

	private List<RendezVous> rendezVousDansOrdre = new ArrayList<>();


	public List<RendezVous> getRendezVousDansOrdre() {
		return rendezVousDansOrdre;
	}

	public void setRendezVousDansOrdre(List<RendezVous> rendezVousDansOrdre) {
		this.rendezVousDansOrdre = rendezVousDansOrdre;
	}

}
