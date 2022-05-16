public class TesteurDeListeChaineeSimple extends TesteurDeListeAbstrait {

	@Override
	public ListeJava<Character> nouvelleListe() {
		return new ListeJavaChaineeSimple<>(Character.class);
	}
}
