# Examen 5) REMISE À 12h

<div style="padding:5px;background:orange;border-style:dotted" >
<strong>IMPORTANT</strong>: l'outil de validation est partiel pour l'examen. Tout vert <code>!=</code> 100%
<div>
<ul>
<li>CONSEIL: ne <strong>pas</strong> perdre de temps à avoir tout vert
<ul>
<li>S'assurer plutôt que votre code est correct <i>selon vous</i>
</ul>
</ul>
<ul>
<li>CONSEIL: <strong>bien lire l'énoncé</strong> pour comprendre ce qu'il faut coder.
<ul>
<li>Les méthodes à écrire sont courtes (20 lignes et moins).
</ul>
</ul>
</div>
</div>

## 10pts) Créer le projet

1. En utilisant Eclipse, je crée un nouveau projet Java
    * Le projet doit **obligatoirement** être comme suit:
        * nom du projet: `examen5`
        * chemin du projet: `~/3c6_PRENOM_NOM/examen5`
        * le projet doit utiliser le **JDK 1.8**
        * le projet utilise la librairie $[download ./examen5_gr2.jar](examen5_gr2.jar)

1. Je change l'encodage à **UTF-8**:
    * Clique-droit sur le projet => Properties
    * Je clique sur Resource
    * Je sélectionne *Text File Encoding* => *Other* => *UTF-8*
    * J'applique avec **Apply and Close**

1. La librairie `examen5_gr2.jar` contient, entre autres:
    * la classe `ListeArray`
    * la classe `ListeGaucheDroite`
    * la classe `ElementListeGaucheDroite`

1. Je crée la classe `MonExamen5` qui hérite de la classe `Examen5Gr2`

1. J'implante les méthodes pour remplir le contrat de `Examen5Gr2`

## 50pts) Créer et implanter `MaListeArray`

<center>
====> $[link ./listeArray/](Cliquer ici pour les détails) <====
</center>

$[java ./MaListeArray]()


## 40pts) Créer et implanter `MaListeGaucheDroite`

<center>
====> $[link ./listeGaucheDroite/](Cliquer ici pour les détails) <====
</center>

$[java ./MaListeGaucheDroite]()


## Finaliser

1. J'ajoute une méthode `main` à la classe `MonExamen5`:

    $[java ./MonExamen5 3 6]()

1. Je m'assure de fournir les objets:

    $[java ./MonExamen5 8 31]()

1. J'exécute mon projet et je m'assure qu'il n'y pas de plantage

1. J'ajoute les fichiers du projet dans Git 

1. Je fais un `commit` et un `push`


## Remise

1. Je pousse un commit avec **exactement** le commentaire `examen5`, p.ex:

        $ git add .
        $ git commit -a --allow-empty -m"examen5"
        $ git push

1. Comme redondance, je fais un `.zip` de mon projet et je le remets sur Moodle

<!--

1. Je peux faire l'entrevue avant la date limite en créant un billet `entrevue 2.2`
    * Le prof va prioriser les questions, je devrai peut-être faire preuve de patience

1. Sinon, le prof va me contacter avec un rendez-vous avant la date limite

-->
