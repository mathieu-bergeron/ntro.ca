package theorie05.modeles.valeurs;

import java.util.ArrayList;
import java.util.List;

import ca.ntro.app.models.Value;

public class Paragraphe implements Value {
	
	private String paragrapheBrut;
	private List<Phrase> phrases = new ArrayList<>();

	public String getParagrapheBrut() {
		return paragrapheBrut;
	}

	public void setParagrapheBrut(String paragrapheBrut) {
		this.paragrapheBrut = paragrapheBrut;
	}

	public List<Phrase> getPhrases() {
		return phrases;
	}

	public void setPhrases(List<Phrase> phrases) {
		this.phrases = phrases;
	}

	public String genererHtml() {
		String html = "<p>";

		for(Phrase phrase : phrases) {
			html += phrase.genererHtml();
		}

		html += "</p>";

		return html;
	}

}
