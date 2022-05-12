# Question d'entrevue

Considérer la hiérarchie de classes suivante:

<center>
<img src="https://ciboulot.ca/cegep/420-3C6-MO/modules/02/04/entrevue/hierarchie_jeux.svg" width="300px"/>
</center>


Considérer le programme suivant:

<pre>
public static void main(String[] args){

    JeuVideo doom = new Doom();
    JeuVideo valorant = new Valorant();

    System.out.println(doom.formater());
    System.out.println(valorant.formater());
}
</pre>

Le programme va afficher:

<pre>
Doom est un fps qui roule à 35 images par seconde
Valorant est un fps qui roule à 120 images par seconde
</pre>

<br>
<br>

Écrire ci-bas les classes `FirstPersonShooter` et `Doom`:

* spécifier l'héritage
* y implanter les **méthodes redéfinies** (avec l'annotation `@Override`)
* spécifier les **bonnes visibilités**
