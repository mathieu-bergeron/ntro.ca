public class ModeleTexte implements Model {

    // ...
    
	public String genererHtml() {
		String html = "";
		
		for(Paragraphe paragraphe : paragraphes) {
			html += paragraphe.genererHtml();
		}

		return html;
	}
}
