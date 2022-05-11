
---
title: ""
weight: 1
# bookFlatSection: false
# bookToc: false
# bookHidden: false
# bookCollapseSection: false
# bookComments: false
# bookSearchExclude: false
---

<pre>

Compléter le code FXML afin de créer des tailles élastiques

&lt;VBox>
    &lt;HBox {1:MCS:HBox~=VBox}.{1:MCS:hgrow~=vgrow}="{1:MCS:=ALWAYS~Infinity}">
    &lt;/HBox>
&lt;/VBox>

&lt;HBox>
    &lt;VBox {1:MCS:=HBox~VBox}.{1:MCS:=hgrow~vgrow}="{1:MCS:=ALWAYS~Infinity}">
    &lt;/VBox>
&lt;/HBox>



</pre>
