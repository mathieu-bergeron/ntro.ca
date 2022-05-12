public ??? Noeud {

    Noeud parent();
    Noeud enfantGauche();
    Noeud enfantDroit();
}

//...

public ??? MonNoeud {

    Noeud parent(){
        return this.parent;
    }

    Noeud enfantGauche(){
        return this.enfantGauche;
    }

    Noeud enfantDroit(){
        return this.enfantDroit;
    }
}

//...

Pile pile = new MaPile();

//...

public void afficherVersion(FileAttente fileAttente){
    if(fiteAttente instanceof MaFileAttente){

        System.out.println("Version maison");

    }else if(fileAttente instanceof ArrayDeque){

        System.out.println("Version du JDK");

    }else if(fileAttente instanceof FileAttenteEquitable){

        System.out.println("Version avec priorités");

    }
}

// ...

Map<String, ValeurJson> objetJson = new WeakHashMap<>();

// ...

Collection<ValeurJson> listeJson = new CopyOnWriteArrayList<>();
