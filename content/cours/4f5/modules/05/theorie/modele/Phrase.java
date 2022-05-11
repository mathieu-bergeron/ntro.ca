package theorie05.modeles.valeurs;

import ca.ntro.app.models.Value;

public class Phrase implements Value  {
	
	private String phraseBrute;

	public String getPhraseBrute() {
		return phraseBrute;
	}

	public void setPhraseBrute(String phraseBrute) {
		this.phraseBrute = phraseBrute;
	}

	public String genererHtml() {
		return phraseBrute + ". ";
	}

}
