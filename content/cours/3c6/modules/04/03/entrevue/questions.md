---
title: ""
weight: 1
bookHidden: true
---


<style>
pre > code {
    -webkit-touch-callout: text;
    -webkit-user-select: text;
    -khtml-user-select: text;
    -moz-user-select: text;
    -ms-user-select: text;
    user-select: text;
}
</style>


# Coder la méthode ci-bas

* Considérer des listes de la sorte: `[{"a":12, "b":34}, {"a":42}, {"b":50}, {"a":8}]`

* En java, le type est `List<Map<String,Integer>>`, c'est à dire:
    * une liste où 
        * chaque élément est un map où
            * chaque clé est une chaîne
            * chaque valeur est un entier

* Coder une méthode qui:
    * reçoit en entrée une clé
    * additionne les entiers associés à cette clé

$[java ./Signature]()



* P.ex pour la clé `"a"`:
    * les entiers à additionner sont `12`, `42` et `8`

* Au besoin, consulter la documentation: 
    * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/List.html" target="_blank">https://docs.oracle.com/javase/8/docs/api/java/util/List.html</a>
    * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html" target="_blank">https://docs.oracle.com/javase/8/docs/api/java/util/Map.html</a>

* Recopier votre code ci-bas:



