---
title: ""
weight: 1
bookHidden: true
---


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

La configuration gradle ci-bas simule la notion de session

<br>

<pre>
    task(amina, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Amina", "Triangle", "#B1740F")
    }

    task(bob, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Bob", "Rectangle", "#FDB833")
    }

    task(charlie, dependsOn: 'classes', type: JavaExec) {
       configure clientConfig
       args("Charlie", "Cercle", "#296EB4")
    }
</pre>

<br>

Compléter le code ci-bas relatif à la notion de session

* Choisir `∅` si une option n'est pas nécessaire

<br>
<br>
<br>

$[java ./Session]()

<br>
<br>
<br>


$[java ./FragmentCollaboration]()
