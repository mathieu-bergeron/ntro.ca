@Override
public int trouverIndicePourValeur(Tableau<C> tab, C v) {
	int i,l;

	for(i=0,l=l(tab);l>0;i=eq(v,v(tab,i%l(tab)))?(--l>0?i++:i):++i);

	return i;
}

private boolean eq(C v1, C v2) {
	return v1.compareTo(v2) == 0;
}

private C v(Tableau<C> tab, int i) {
	return tab.obtenirValeur(i);
}

private int l(Tableau<C> tab) {
	return tab.longueur();
}
