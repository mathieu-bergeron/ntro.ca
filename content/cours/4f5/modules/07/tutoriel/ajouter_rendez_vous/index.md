# Tutoriel 7.4: ajouter un rendez-vous

1. Intuitivement, j'ajouterais

    $[java ./Intuitivement01]()

    * NOTE:
        * comme il y a un appel à *get*, on peut inverser le dépendance


1. En inversant, j'ajoute plutôt `MsgAjouterRendezVous.ajouterA`

    $[java ./MsgAjouterRendezVous01]()


    * NOTE:
        * maintenant il n'y a pas d'appel à *get*
        * le `nomPremierJoueur` appartient au message


1. J'implante `ajouterRendezVousPour`

    $[java ./ModeleFileAttente01]()

1. J'implante le constructeur pour `RendezVous`

    $[java ./RendezVous01]()

    * NOTES:
        * je **dois conserver** le constructeur par défaut
        * mais j'ai le droit d'ajouter d'autres constructeurs


1. Finalement, j'appelle `ajouterA` au bon endroit dans `ModifierFileAttente`

    $[java ./ModifierFileAttente01]()


