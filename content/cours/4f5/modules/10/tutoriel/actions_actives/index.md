---
title: ""
weight: 1
bookHidden: true
---


# Optionnel 10.2: mieux gérer les actions joueurs

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

1. Dans `valeurs`, créer la classe `ActionsActives`

    $[java ./ActionsActives]()

1. **Déclarer** la valeur dans `Declarations`

1. Dans `valeurs`, créer la classe `ActionsActivesParCadran`

    $[java ./ActionsActivesParCadran]()

1. **Déclarer** la valeur dans `Declarations`

1. Dans `VuePartie`, modifier le code comme suit

    $[java ./VuePartie]()

1. Vérifier que ça fonctionne

        $ sh gradlew serveur
        $ sh gradlew alice
        $ sh gradlew bob

