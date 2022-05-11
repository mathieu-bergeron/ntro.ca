# JavaFX: tailles élastiques

## À l'intérieur d'un *HBox*

<center>
<video width="50%" src="hbox.mp4" type="video/mp4" controls>
</center>

1. Les conteneurs grandissent automatiquement en *hauteur*:

    <center>
    <img src="vues03a.png"/>
    <center>

    $[xml ./vues03a]()


1. Pour qu'un conteneur grandisse en *largeur*, il faut ajouter `HBox.hgrow="ALWAYS"`

    <center>
    <img src="vues03b.png"/>
    <center>

    $[xml ./vues03b]()


## À l'intérieur d'un *VBox*

<center>
<video width="50%" src="vbox.mp4" type="video/mp4" controls>
</center>

1. Les conteneurs grandissent automatiquement en *largeur*:

    <center>
    <img src="vues03c.png"/>
    <center>

    $[xml ./vues03c]()


1. Pour qu'un conteneur grandisse en *hauteur*, il faut ajouter `VBox.vgrow="ALWAYS"`

    <center>
    <img src="vues03d.png"/>
    <center>

    $[xml ./vues03d]()

## Attention: `HBox.hgrow` faire référence au parent

<center>
<video width="50%" src="parent_hbox.mp4" type="video/mp4" controls>
</center>

1. On peut appliquer à n'importe quel composant
1. La signification est: si je suis à l'intérieur d'un *HBox*, alors je grandis en largeur

    <center>
    <img src="vues03e.png"/>
    <center>

    $[xml ./vues03e]()


## Attention: `VBox.vgrow` faire référence au parent

<center>
<video width="50%" src="parent_vbox.mp4" type="video/mp4" controls>
</center>

1. On peut appliquer à n'importe quel composant
1. La signification est: si je suis à l'intérieur d'un *VBox*, alors je grandis en hauteur

    <center>
    <img src="vues03f.png"/>
    <center>

    $[xml ./vues03f]()


## Exemples du tutoriel 07

<center>
<video width="50%" src="exemples.mp4" type="video/mp4" controls>
</center>

1. Sans tailles élastiques

    <center>
        <img width="45%" src="tut07_sans_dev.png"/>
    </center>
    <center>
        <img width="45%" src="tut07_sans_prod.png"/>
    </center>

1. Avec tailles élastiques

    <center>
        <img width="45%" src="tut07_avec_dev.png"/>
    </center>
    <center>
        <img width="45%" src="tut07_avec_prod.png"/>
    </center>

1. En action

    <video width="100%" src="tut07_elastique.mp4" type="video/mp4" loop nocontrols autoplay>

    * NOTES:
        * les espaces élastiques se rapetissent
        * celui du haut reste le même (à cause de son `-fx-min-height`)
        * à la fin JavaFx est forcé de rapetisser l'espace du haut
            * car impossible de respecter tous les `fx-min-height`



