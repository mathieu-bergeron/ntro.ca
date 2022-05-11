# Optionnel 9.2: réagir aux actions du joueur

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

1. Dans `modeles.enums`, créer l'enum suivant

    $[java ./Action]()

1. Dans `modeles.valeurs`, créer la classe suivante

    $[java ./ActionJoueur]()

1. Créer la méthode `appliquerActionJoueur` avec $[kbd](Ctrl+1)

1. Dans `DonneesVuePartie`, ajouter le code suivant

    $[java ./DonneesVuePartie]()

1. Créer la méthode `appliquerActionJoueur` avec $[kbd](Ctrl+1)

1. Dans `evenements`, ajouter la classe suivante

    $[java ./EvtActionJoueur]()

1. Avec `registrar.registerEvent`, **déclarer** l'événement dans le frontal
<!--
1. Dans `messages`, ajouter la classe suivante

    $[java ./MsgPropagerDonnees2d]()

1. Avec `registrar.registerMessage`, **déclarer** le message dans le client
-->

1. Dans `partie.xml`, ajouter un `fx:id` au conteneur principal

    $[xml ./partie]()

1. Dans `VuePartie`, ajouter le code suivant

    $[java ./VuePartie]()

1. Dans `monde_pong2d`, ajouter la classe suivante

    $[java ./Palette2d]()

1. Avec `registrar.registerValue`, **déclarer** la valeur `Palette2d` dans le client

1. Dans `Balle2d`, ajouter le code suivant

    $[java ./Balle2d]()

1. Dans `MondePong2d`, ajouter le code suivant

    $[java ./MondePong2d]()


1. Dans `AfficherPartie`, ajouter la tâche suivante

    $[java ./AfficherPartie]()

1. Vérifier que ça fonctionne

<center>
<video width="50%" src="optionnel02.mp4" type="video/mp4" loop nocontrols autoplay>
</center>

<!--
1. Dans `ModifierPartie` ajouter la tâche suivante

    $[java ./ModifierPartie]()
    -->
