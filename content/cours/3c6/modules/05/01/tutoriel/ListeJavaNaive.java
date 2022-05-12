public class ListeJavaNaive<E extends Object> extends ListeJava<E> {

	private E[] elements = nouveauTableau(0);

	public ListeJavaNaive(Class<E> typeElement) {
		super(typeElement);
	}

	private void copier(E[] src, int debutSrc, int finSrc, E[] dst, int debutDst) {
		int decalage = debutDst - debutSrc;

		for(int i = debutSrc; i <= finSrc; i++){
			dst[i+decalage] = src[i];
		}
	}

	@Override
	public void add(E e) {
		insert(size(), e);
	}

	@Override
	public void addAll(E[] elements) {
		for(E e : elements) {
			add(e);
		}
	}

	@Override
	public void insert(int i, E e) {
		E[] nouveauxElements = nouveauTableau(elements.length + 1);
		
		copier(elements, 0, i-1, nouveauxElements, 0);
		
		nouveauxElements[i] = e;
		
		copier(elements, i, elements.length-1, nouveauxElements, i+1);

		elements = nouveauxElements;
	}

	@Override
	public void set(int i, E e) {
		elements[i] = e;
	}

	@Override
	public E get(int i) {
		return elements[i];
	}

	@Override
	public void clear() {
		elements = nouveauTableau(0);
	}

	@Override
	public int size() {
		return elements.length;
	}

	@Override
	public boolean isEmpty() {
		return elements.length == 0;
	}

	@Override
	public boolean contains(Object o) {
		return indexOf(o) != -1;
	}

	@Override
	public int indexOf(Object o) {
		int indice = -1;
		
		for(int i = 0; i < elements.length; i++) {
			if(elements[i].equals(o)) {
				indice = i;
				break;
			}
		}

		return indice;
	}

	@Override
	public void removeValue(Object o) {
		int indice = indexOf(o);
		if(indice >= 0) {
			remove(indice);
		}
	}

	@Override
	public void remove(int i) {
		E[] nouveauxElements = nouveauTableau(elements.length - 1);
		
		copier(elements, 0, i-1, nouveauxElements, 0);
		copier(elements, i+1, elements.length-1, nouveauxElements, i);
		
		elements = nouveauxElements;
	}

}
