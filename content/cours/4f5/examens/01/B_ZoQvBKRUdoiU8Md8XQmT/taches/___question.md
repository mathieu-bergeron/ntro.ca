---
title: ""
weight: 1
bookHidden: true
---


Considérer le graphe de tâches suivant:

<center>
    <img width="500px" src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/B_ZoQvBKRUdoiU8Md8XQmT/taches/groupeA.png"/>
</center>


Compléter le code `.java` ci-bas.

Choisir `∅` si une option n'est pas utile.



<code>
<pre>
public static void creerTaches(FrontendTasks tasks) {

	{1:MCS:=tasks.taskGroup("A")~∅}
		 {1:MCS:=.waitsFor("Initialisation")~∅}
		 {1:MCS:=.contains(subTasks -> &#123;~∅}
		     {1:MCS:=a1~a2~a3~a4~a5~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		     {1:MCS:a1~=a2~a3~a4~a5~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		     {1:MCS:a1~a2~a3~=a4~a5~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		     {1:MCS:a1~a2~=a3~a4~a5~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		     {1:MCS:a1~a2~a3~a4~=a5~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		 {1:MCS:=&#125;);~∅}
}

private static void a1(FrontendTasks subTasks) {
	subTasks.task("a1")

		    {1:MCS:.waitsFor("a1")~=∅}
		    {1:MCS:.waitsFor("a2")~=∅}
		    {1:MCS:.waitsFor("a3")~=∅}
		    {1:MCS:.waitsFor("a4")~=∅}
		    {1:MCS:.waitsFor("a5")~=∅}

		    .executes(inputs -> {
		        
		    });
}

private static void a2(FrontendTasks subTasks) {
	subTasks.task("a2")

		    {1:MCS:=.waitsFor("a1")~∅}
		    {1:MCS:.waitsFor("a2")~=∅}
		    {1:MCS:.waitsFor("a3")~=∅}
		    {1:MCS:.waitsFor("a4")~=∅}
		    {1:MCS:.waitsFor("a5")~=∅}

		    .executes(inputs -> {

		    });
}

private static void a3(FrontendTasks subTasks) {
	subTasks.task("a3")

		    {1:MCS:.waitsFor("a1")~=∅}
		    {1:MCS:=.waitsFor("a2")~∅}
		    {1:MCS:.waitsFor("a3")~=∅}
		    {1:MCS:=.waitsFor("a4")~∅}
		    {1:MCS:.waitsFor("a5")~=∅}

		    .executes(inputs -> {

		    });
}

private static void a4(FrontendTasks subTasks) {
	subTasks.task("a4")

		    {1:MCS:.waitsFor("a1")~=∅}
		    {1:MCS:.waitsFor("a2")~=∅}
		    {1:MCS:.waitsFor("a3")~=∅}
		    {1:MCS:.waitsFor("a4")~=∅}
		    {1:MCS:.waitsFor("a5")~=∅}

		    .executes(inputs -> {

		    });
}

private static void a5(FrontendTasks subTasks) {
	subTasks.task("a5")

		    {1:MCS:.waitsFor("a1")~=∅}
		    {1:MCS:.waitsFor("a2")~=∅}
		    {1:MCS:.waitsFor("a3")~=∅}
		    {1:MCS:=.waitsFor("a4")~∅}
		    {1:MCS:.waitsFor("a5")~=∅}

		    .executes(inputs -> {

		    });
}


</pre>
</code>
