package tutoriels.generer_atelier5_3.solution;

import java.util.ArrayList;
import java.util.List;

import tutoriels.generer_tutoriel5_3.solution.MapJavaNaif;
import tutoriels.map.CleHachable;
import tutoriels.map.MapJava;

public class MapJavaHash <C extends CleHachable<?>, V extends Object> extends MapJava<C,V> {
	
	private static final int TAILLE_TABLE_HACHAGE = 1000;
	
	@SuppressWarnings("unchecked")
	private MapJavaNaif<C,V>[] table = new MapJavaNaif[TAILLE_TABLE_HACHAGE];
	private int taille = 0;
	
	private int indiceTable(C c) {
		int indiceBrut = c.indice();
		return indiceBrut % TAILLE_TABLE_HACHAGE;
	}

	@Override
	public void put(C c, V v) {
		int indiceTable = indiceTable(c);
		MapJavaNaif<C,V> mapPourIndice = table[indiceTable];
		
		if(mapPourIndice == null) {
			mapPourIndice = new MapJavaNaif<C,V>();
			table[indiceTable] = mapPourIndice;
		}
		
		int tailleMapPourIndiceAvant = mapPourIndice.size();

		mapPourIndice.put(c, v);
		
		int tailleMapPourIndiceApres = mapPourIndice.size();
		
		taille += (tailleMapPourIndiceApres - tailleMapPourIndiceAvant);
		
	}

	@Override
	public V get(C c) {
		V valeur = null;

		int indiceTable = indiceTable(c);
		MapJavaNaif<C,V> mapPourIndice = table[indiceTable];
		
		if(mapPourIndice != null) {
			valeur = mapPourIndice.get(c);
		}
		
		return valeur;
	}

	@Override
	public void clear() {
		table = new MapJavaNaif[TAILLE_TABLE_HACHAGE];
		taille = 0;
	}

	@Override
	public int size() {
		return taille;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public boolean containsKey(C c) {
		boolean siContient = false;

		int indiceTable = indiceTable(c);
		MapJavaNaif<C,V> mapPourIndice = table[indiceTable];
		
		if(mapPourIndice != null) {
			siContient = mapPourIndice.containsKey(c);
		}

		return siContient;
	}

	@Override
	public boolean containsValue(V v) {
		boolean siContient = false;
		
		for(int i = 0; i < table.length; i++) {
			if(table[i] != null && table[i].containsValue(v)) {
				siContient = true;
				break;
			}
		}

		return siContient;
	}

	@Override
	public void remove(C c) {
		int indiceTable = indiceTable(c);
		MapJavaNaif<C,V> mapPourIndice = table[indiceTable];
		
		if(mapPourIndice == null) {
			mapPourIndice = new MapJavaNaif<C,V>();
			table[indiceTable] = mapPourIndice;
		}
		
		int tailleMapPourIndiceAvant = mapPourIndice.size();

		mapPourIndice.remove(c);
		
		int tailleMapPourIndiceApres = mapPourIndice.size();
		
		taille += (tailleMapPourIndiceApres - tailleMapPourIndiceAvant);
	}

	@Override
	public List<C> keys() {
		List<C> cles = new ArrayList<>();

		for(int i = 0; i < table.length; i++) {
			if(table[i] != null) {
				cles.addAll(table[i].keys());
			}
		}
		
		return cles;
	}

}
