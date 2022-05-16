public class ListeJavaDebut<E extends Object> extends ListeJava<E> {
	
	private final int TAILLE_INITIALE = 100;

	private E[] grosTableau = nouveauTableau({1:MCS:=TAILLE_INITIALE~0~∅});
	private int indicePremierElement = {1:MCS:=TAILLE_INITIALE~TAILLE_INITIALE-1~0~-1~∅};

	// [...]
	
	private void copier(E[] src, int debutSrc, int finSrc, E[] dst, int debutDst) {
	    // comme dans le tutoriel et l'atelier
	}
	
	private void aggrandir() {
		int ancienneTaille = {1:MCS:=grosTableau.length~TAILLE_INITIALE~∅}
		int nouvelleTaille = ancienneTaille * 2;

		E[] nouveauTableau = nouveauTableau({1:MCS:=nouvelleTaille~TAILLE_INITIALE~0~∅});
		
		int nouvelIndicePremierElement = {1:MCS:=nouvelleTaille~ancienneTaille~0~∅} - {1:MCS:=ancienneTaille~nouvelleTaille~0~∅};
		
		copier({1:MCS:=grosTableau~nouveauTableau~∅}, {1:MCS:=indicePremierElement~0~ancienneTaille~nouvelleTaille~-1~∅}, {1:MCS:=ancienneTaille~nouvelleTaille~0~∅}{1:MCS:=-1~∅}, {1:MCS:=nouveauTableau~grosTableau~∅}, {1:MCS:=nouvelIndicePremierElement~0~indicePremierElement~∅});
		
		indicePremierElement = nouvelIndicePremierElement;
		grosTableau = nouveauTableau;
	}

	// [...]

	@Override
	public void insert(int position, E e) {
		if(indicePremierElement == {1:MCS:=0~grosTableau.length~grosTableau.length-1~∅}) {
			aggrandir();
		}
		
		// décaler vers la gauche
		for(int i = {1:MCS:=indicePremierElement~position~indicePremierElement+position~∅}; i < {1:MCS:=indicePremierElement+position~indicePremierElement~grosTableau.length~grosTableau.length-1~∅}; i++) {
			grosTableau[i-1] = grosTableau[i];
		}

		indicePremierElement--;

		grosTableau[{1:MCS:=indicePremierElement+position~position~grosTableau.length~grosTableau.length-1~0~∅}] = e;
	}

	@Override
	public void set(int position, E e) {
		grosTableau[{1:MCS:=indicePremierElement+position~position~grosTableau.length~grosTableau.length-1~0~∅}] = e;
	}

	@Override
	public E get(int position) {
		return grosTableau[{1:MCS:=indicePremierElement+position~position~grosTableau.length~grosTableau.length-1~0~∅}] = e;
	}

	@Override
	public void clear() {
		indicePremierElement = {1:MCS:=grosTableau.length~grosTableau.length-1~0~-1~TAILLE_INITIALE~TAILLE_INITIALE-1~∅};
	}

	@Override
	public int size() {
		return {1:MCS:=grosTableau.length - indicePremierElement~grosTableau.length~grosTableau.length-1~0~-1~TAILLE_INITIALE~TAILLE_INITIALE-1~indicePremierElement~∅};
	}

	// [...]

	@Override
	public int indexOf(Object o) {
		int position = -1;

		for(int i = indicePremierElement; i < grosTableau.length; i++) {
			if(grosTableau[i].equals(o)) {
				position = {1:MCS:=i - indicePremierElement~0~-1~indicePremierElement~grosTableau.length-indicePremierElement~i~i-1~i+1~∅};
				break;
			}
		}

		return position;
	}

	@Override
	public void remove(int position) {
		
		// décaler vers la droite
		for(int i = {1:MCS:=indicePremierElement+position~indicePremierElement~position~grosTableau.length~0~TAILLE_INITIALE~TAILLE_INITIALE-1~grosTableau.length-1~∅}; i > {1:MCS:=indicePremierElement~indicePremierElement+position~position~grosTableau.length~grosTableau.length-1~TAILLE_INITIALE~TAILLE_INITIALE-1~0~-1~∅}; i--) {
			grosTableau[i] = grosTableau[i-1];
		}

		indicePremierElement++;
	}
}
