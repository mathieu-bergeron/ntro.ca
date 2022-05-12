---
title: ""
weight: 1
bookHidden: true
---


Considérer la Vue suivante

<center>
    <img height="400px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/B_ZoQvBKRUdoiU8Md8XQmT/fxml_css/resultat.png"/>
</center>

Compléter le code `.fxml` et `.css` ci-bas.

Choisir `∅` si une option n'est pas utile.

NOTE: il faut choisir les noms les plus pertinents.


## Compléter le FXML

<code>
<pre>

〈VBox xmlns:fx="http://javafx.com/fxml"
    styleClass="{1:MCS:=conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"
    id="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~=conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"〉

    〈StackPane  styleClass="{1:MCS:conteneur~=espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"〉〈/StackPane〉

    〈StackPane fx:id="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~=conteneurUn~conteneurDeux~∅}" styleClass="{1:MCS:=conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}" id="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~=conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"〉

        〈Button styleClass="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~=gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}" text="{1:MCS:=%chaineA~Chaîne %A~Chaîne A~∅}"〉〈/Button〉

    〈/StackPane〉

    〈VBox  styleClass="{1:MCS:conteneur~=espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"〉〈/VBox〉

    〈{1:MCS:=VBox~StackPane~∅} fx:id="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~=conteneurDeux~∅}" styleClass="{1:MCS:=conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}" id="{1:MCS:conteneur~espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~=conteneur-deux~conteneurUn~conteneurDeux~∅}"〉

        〈Label styleClass="{1:MCS:conteneur~espace-vertical~espace-horizontal~=gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}" text="{1:MCS:=%chaineB~Chaîne %B~Chaîne B~∅}"〉〈/Label〉

        〈StackPane  styleClass="{1:MCS:conteneur~=espace-vertical~espace-horizontal~gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}"〉〈/StackPane〉

        〈Label styleClass="{1:MCS:conteneur~espace-vertical~espace-horizontal~=gros-texte~gros-bouton~conteneur-principal~conteneur-un~conteneur-deux~conteneurUn~conteneurDeux~∅}" text="{1:MCS:=%chaineC~Chaîne %C~Chaîne C~∅}"〉〈/Label〉

    〈/{1:MCS:=VBox~StackPane~∅}〉

〈/VBox〉

</pre>
</code>

## Compléter le CSS

<code>
<pre>
{1:MCS:#~=.}conteneur {
    -fx-background-color:{1:MCS:darkblue~black~=gray~darkgreen};
    -fx-border-width:10;
}

{1:MCS:#~=.}gros-bouton {
    -fx-padding: 8 15 15 15;
    -fx-background-insets: 0,0 0 5 0, 0 0 6 0, 0 0 7 0;
    -fx-background-radius: 8;
    -fx-background-color: 
        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),
        #9d4024,
        #d86e3a,
        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);
    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );
    -fx-font-weight: bold;
    -fx-font-size: 1.1em;
}

{1:MCS:#~=.}gros-texte {
    -fx-padding: 15 15 15 15;
    -fx-background-color: 
        linear-gradient(from 0% 93% to 0% 100%, #a34313 0%, #903b12 100%),
        #9d4024,
        #d86e3a,
        radial-gradient(center 50% 50%, radius 100%, #d86e3a, #c54e2c);
    -fx-effect: dropshadow( gaussian , rgba(0,0,0,0.75) , 4,0,0,1 );
    -fx-font-weight: bold;
    -fx-font-size: 1.1em;
}

{1:MCS:#~=.}conteneur-principal {
    -fx-alignment: {1:MCS:=top-center~top-left~top-right~center-left~center~center-right~bottom-left~bottom-right};
}

{1:MCS:#~=.}espace-{1:MCS:=vertical~horizontal} {
    -fx-min-height:{1:MCS:=100~400};
}

{1:MCS:=#~.}conteneur-un {
    -fx-min-height:{1:MCS:=100~400};
    -fx-alignment:{1:MCS:top-center~top-left~top-right~center-left~center~center-right~=bottom-left~bottom-right};
    -fx-border-color:{1:MCS:=darkblue~black~gray~darkgreen};
}

{1:MCS:=#~.}conteneur-deux {
    -fx-border-color:{1:MCS:darkblue~black~gray~=darkgreen};
    -fx-min-height:{1:MCS:100~=400};
    -fx-alignment:{1:MCS:top-center~top-left~top-right~center-left~center~center-right~bottom-left~=bottom-right};
}


</pre>
</code>
