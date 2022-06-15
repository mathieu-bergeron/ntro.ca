---
title: ""
weight: 1
bookHidden: true
---


# Théorie: changer de page en `Ntro`

<center>
<video width="50%" src="changer_page.mp4" type="video/mp4" controls>
</center>

## Afficher une sous-vue dans la `VueRacine`

* On a déjà la méthode pour afficher une sous-vue

    $[java ./VueRacine]()

## Créer des tâches pour changer de sous-vue


* On va crée une tâche capable d'afficher la `VuePartie`

    $[java ./Navigation]()


    * NOTES:
        * la tâche `afficherVuePartie` fait partie du groupe `Navigation`
        * on a pas à déclarer le `waitsFor(created(VueRacine))`
