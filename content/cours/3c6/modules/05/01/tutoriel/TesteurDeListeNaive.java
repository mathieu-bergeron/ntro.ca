public class TesteurDeListeNaive extends TesteurDeListeAbstrait {

	@Override
	public ListeJava<Character> nouvelleListe() {
		return new ListeJavaNaive<>(Character.class);
	}
}
