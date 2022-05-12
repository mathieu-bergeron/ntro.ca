---
title: ""
weight: 1
bookHidden: true
---


# Optionnel 10.1: propager les actions joueurs

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
<strong>NOTES</strong>
<div style="text-align:left">
<ul>
<li>Ce matériel est moins détaillé que d'habitude.
<li>Au besoin, demander des clarifications au prof.
</ul>
</div>
</center>

1. Créer le message `MsgPropagerActionJoueur`

    $[java ./MsgPropagerActionJoueur]()

1. **Déclarer** le message dans `Declarations`


1. Dans `AfficherPartie`, ajouter ce code

    $[java ./AfficherPartie01]()

1. Créer la méthode `EvtActionJoueur.copierActionDans`

    $[java ./EvtActionJoueur]()

1. Dans `AfficherPartie`, ajouter ce code

    $[java ./AfficherPartie02]()


1. Vérifier que ça fonctionne

        $ sh gradlew serveur
        $ sh gradlew alice
        $ sh gradlew bob

