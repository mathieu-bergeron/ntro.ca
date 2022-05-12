public boolean accepterSiDeuxRoues(Vehicule vehicule) {
	return vehicule.nombreDeRoues() == 2;
}

accepterSiDeuxRoues(new Vehicule());
accepterSiDeuxRoues(new DeuxRoues());
accepterSiDeuxRoues(new Moto());
accepterSiDeuxRoues(new Mobilette());

public boolean accepterSiVespa(Vehicule vehicule) {
    boolean accepter = false;

    if(vehicule instanceof Mobilette){

        accepter = true;
    }

    return accepter;
}

public boolean accepterSiVespa(Vehicule vehicule) {
    boolean accepter = false;

    if(vehicule instanceof Mobilette){

        Mobilette mobilette = (Mobilette) vehicule;

        accepter = mobilette.marqueDeMobilette().equals("Vespa");
    }

    return accepter;
}

accepter = ((Mobilette) vehicule).marqueDeMobilette().equals("Vespa");

((Moto) vehicule).nombreDeRoues(); // si vehicule n'est pas une Moto
((Chat) vehicule).nombreDeRoues();


