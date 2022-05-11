public class Paragraphe implements Value {

    // ...

	public String genererHtml() {
		String html = "<p>";

		for(Phrase phrase : phrases) {
			html += phrase.genererHtml();
		}

		html += "</p>";

		return html;
	}

}
