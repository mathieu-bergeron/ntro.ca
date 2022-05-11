# Document de conception pour `QuatreDeSuite`

## Page Accueil

1. La page accueil permet de
    * créer une nouvelle partie locale
    * créer une nouvelle partie réseau
    * ouvrir la fenêtre des paramètres
    * quitter

## Paramètres

1. On peut choisir:
    * taille de la grille (petite, moyenne ou grande)
    * la couleur qui commence à jouer (rouge ou jaune)

### Modèle en JSON

<pre>
{
  "quiCommence": "JAUNE",
  "tailleGrille": "MOYENNE",
}
</pre>

## Partie locale

1. La nouvelle partie utilise les paramètres courants (p.ex: taille de la grille)
1. Cliquer sur l'en-tête ajoute un jeton
    * si la colonne est pleine, on bloque l'en-tête
1. Quitter via le menu sauvegarde la partie courante
1. S'il y a une partie sauvegardée, elle est chargée au départ

### Modèle en JSON


<pre>
{
  "hauteur": 4,
  "couleurCourante": "JAUNE",
  "grille": {
    "colonnes": [
      {
        "jetons": [
          {
            "couleur": "JAUNE"
          }
        ]
      },
      {
        "jetons": [
          {
            "couleur": "ROUGE"
          },
          {
            "couleur": "JAUNE"
          }
        ]
      },
      {
        "jetons": []
      },
      {
        "jetons": [
          {
            "couleur": "ROUGE"
          }
        ]
      }
    ]
  },
}
</pre>

## Partie réseau

1. La nouvelle partie utilise les paramètres courants (des deux côtés)
    * message d'erreur s'il n'y a pas de connexion au serveur
1. Cliquer sur l'en-tête ajoute un jeton localement et chez l'adversaire
