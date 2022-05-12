---
title: ""
weight: 1
bookHidden: true
---


# Utilisation de Gradle

* On utilise encore Eclipse, mais avec des précautions
    * chaque atelier est son propre projet
    * pas de dépendances à d'autres projets

# Organisation des dépôts

* Pour moi:
    * SOURCE: 
        * un dossier par atelier, p.ex:
            * `atelier05` et `atelier05_corrige`... `atelier05_jsweet` ??
        * des sous-modules pour le code commun

* Pour les étudiants
    * GITHUB:
        * sert uniquement à faire des pull
        * un dossier par atelier
            * uniquement atelier05
        * pas de sous-modules
        * cp -rf de SOURCE vers GITHUB avant de publier sur github
        * le cp -rf «fixe» les sous-modules
    * ETUDIANT
        * chaque atelier commence par cp -rf de GITHUB vers ETUDIANT
        * ensuite, le projet est importé dans Eclipse
        * en principe, on importe une seule fois dans Eclipse
    * PROF
        * une deuxième copie de ETUDIANT, en permanence sur la branche prof
        
       
