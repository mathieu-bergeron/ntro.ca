---
title: ""
weight: 1
bookHidden: true
---



Considérer l'application de dessins collaboratifs.

Considérer le modèle suivant:

<center>
    <img width="500px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/A_Up0m2PvzbQggaOmWFlCm/modele/ModeleDessin.png"/>
</center>


Compléter la sauvegarde `.json` du modèle ci-bas.

Choisir `∅` si une option n'est pas utile.

<br>
<br>

**NOTE**: ajouter les attributs dans l'ordre du schéma

<br>
<br>





<code>
<pre>
{
  {1:MCS:="_C":~"_T":~"_class":~"_type":~∅} {1:MCS:="ModeleDessin",~"Forme",~"Cercle",~"Rectangle",~"Liste<Forme>",~∅}
  "formes": {1:MCS:=[~&#123;~∅}
      {1:MCS:[~=&#123;~∅}
          {1:MCS:="_C":~"_T":~"_class":~"_type":~∅} {1:MCS:"Forme",~="Cercle",~"Rectangle",~∅}
          {1:MCS:="centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~∅} {1:MCS:=100,~50,~10,~true,~30,~5,~15,~false,~∅}
          {1:MCS:"centreX":~="centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~∅} {1:MCS:100,~=50,~10,~true,~30,~5,~15,~false,~∅}
          {1:MCS:"centreX":~"centreY":~="rayon":~"rempli":~"hauteur":~"largeur":~∅} {1:MCS:100,~50,~=10,~true,~30,~5,~15,~false,~∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~="rempli":~"hauteur":~"largeur":~∅} {1:MCS:100~50~10~=true~30~5~15~false~∅}
      {1:MCS:]~=&#125;~∅}{1:MCS:=,~∅}
      {1:MCS:[~=&#123;~∅}
          {1:MCS:="_C":~"_T":~"_class":~"_type":~∅} {1:MCS:"Forme",~"Cercle",~="Rectangle",~∅}
          {1:MCS:="centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~∅} {1:MCS:100,~50,~10,~true,~=30,~5,~15,~false,~∅}
          {1:MCS:"centreX":~="centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~∅} {1:MCS:100,~50,~=10,~true,~30,~5,~15,~false,~∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~="largeur":~∅} {1:MCS:100,~50,~10,~true,~30,~5,~=15,~false,~∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~="hauteur":~"largeur":~∅} {1:MCS:100~50~10~true~30~=5~15~false~∅}
      {1:MCS:]~=&#125;~∅}{1:MCS:,~=∅}
      {1:MCS:[~=&#123;~=∅}
          {1:MCS:"_C":~"_T":~"_class":~"_type":~=∅} {1:MCS:"Forme",~"Cercle",~"Rectangle",~=∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~=∅} {1:MCS:100,~50,~10,~true,~30,~5,~15,~false,~=∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~=∅} {1:MCS:100,~50,~10,~true,~30,~5,~15,~false,~=∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~=∅} {1:MCS:100,~50,~10,~true,~30,~5,~15,~false,~=∅}
          {1:MCS:"centreX":~"centreY":~"rayon":~"rempli":~"hauteur":~"largeur":~=∅} {1:MCS:100~50~10~true~30~5~15~false~=∅}
      {1:MCS:]~&#125;~=∅}{1:MCS:,~=∅}
  {1:MCS:=]~&#125;~∅}
}
</pre>
</code>
