---
title: ""
weight: 1
bookHidden: true
---


Considérer l'application de dessins collaboratifs.

<center>
<video src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/A_Up0m2PvzbQggaOmWFlCm/examen01A.mp4" type="video/mp4" loop nocontrols autoplay>
</center>

Compléter le code `.java` nécessaire à naviguer vers la page file d'attente.

Choisir `∅` si une option n'est pas utile.


<br>
<br>
<br>
<br>



* Dans `{1:MCS:VueDessin~VueFileAttente~VueRacine~Navigation~=FrontalDessin~Initialisation~EvtAfficherFileAttente~EvtAfficherVueDessin~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant


<code>
<pre>
@Override
public void registerEvents(EventRegistrar registrar) {
	registrar.registerEvent({1:MCS:=EvtAfficherFileAttente.class~EvtAfficherVueDessin.class~EvtAfficherPartie.class~EvtAfficherVueRacine.class~EvtAfficherVueRacine~EvtAfficherFileAttente~EvtAfficherFileAttente~EvtAfficherPartie});
}
</pre>
</code>

<br>
<br>


* Dans `{1:MCS:=VueDessin~VueFileAttente~VueRacine~Navigation~FrontalDessin~Initialisation~EvtAfficherFileAttente~EvtAfficherVueDessin~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
{1:MCS:=EvtAfficherFileAttente~EvtAfficherVueDessin~EvtAfficherPartie~EvtAfficherVueRacine} evtNtro = NtroApp.newEvent({1:MCS:=EvtAfficherFileAttente.class~EvtAfficherVueDessin.class~EvtAfficherPartie.class~EvtAfficherFileAttente~EvtAfficherFileAttente~EvtAfficherPartie~EvtAfficherVueRacine~EvtAfficherVueRacine.class});

boutonRetour.setOnAction({1:MCS:=evtFx~evtNtro} -> {

	{1:MCS:=evtNtro~evtFx}.trigger();
});
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueDessin~VueFileAttente~VueRacine~=Navigation~FrontalDessin~Initialisation~EvtAfficherFileAttente~EvtAfficherVueDessin~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.taskGroup({1:MCS:="Navigation"~"Initialisation"~"AfficherVueFileAttente"~"AfficherVueDessin"})

	 {1:MCS:=.waitsFor~∅}{1:MCS:=("Initialisation")~("Navigation")~("AfficherFileAttente")~("AfficherDessin")~∅}

	 .andContains(subTasks -> {

		 {1:MCS:=creerVueFileAttente~creerVueDessin~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		 {1:MCS:=afficherVueFileAttente~afficherVueDessin~∅}{1:MCS:=(subTasks);~(tasks);~∅}

	 });
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueDessin~VueFileAttente~VueRacine~=Navigation~FrontalDessin~Initialisation~EvtAfficherFileAttente~EvtAfficherVueDessin~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.task(create({1:MCS:=VueFileAttente.class~VueDessin.class~VuePartie.class~VueFileAttente~VueDessin~VuePartie}))

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(viewLoader(VueFileAttente.class))~(viewLoader(VueDessin.class))~(viewLoader(VuePartie.class))~(viewLoader(VueDessin))~(viewLoader(VueFileAttente))~(viewLoader(VuePartie))~∅}

	 .thenExecutesAndReturnsValue(inputs -> {
		 
		 {1:MCS:=ViewLoader〈VueFileAttente〉~ViewLoader〈VueDessin〉~ViewLoader〈VuePartie〉~~~~∅} {1:MCS:=viewLoader~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(viewLoader(VueFileAttente.class));~inputs.get(viewLoader(VueDessin.class));~inputs.get(viewLoader(VuePartie.class));~new ViewLoader〈VueFileAttente〉();~new ViewLoader〈VueDessin〉();~new ViewLoader〈VuePartie〉();~∅}
		 
		 return {1:MCS:new~=∅}{1:MCS:=viewLoader.createView()~VueFileAttente()~VueDessin()~VuePartie()~∅};
	 });
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueDessin~VueFileAttente~VueRacine~=Navigation~FrontalDessin~Initialisation~EvtAfficherFileAttente~EvtAfficherVueDessin~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.task({1:MCS:="afficherVueFileAttente"~"afficherVuePartie"~"afficherVueDessin"})

	 {1:MCS:.waitsFor~=∅}{1:MCS:(created(VueRacine.class))~(created(VueDessin.class))~=∅}

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(created(VueFileAttente.class))~(created(VuePartie.class))~∅}

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(event(EvtAfficherFileAttente.class))~(event(EvtAfficherVueDessin.class))~(event(EvtAfficherPartie.class))~(event(EvtAfficherVueRacine.class))~∅}

	 .thenExecutes(inputs -> {

		 {1:MCS:=VueRacine~VueDessin~∅} {1:MCS:=vueRacine~vueDessin~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(created(VueRacine.class));~inputs.get(created(VueDessin.class));~new VueRacine()~new VueDessin()~∅}
		 {1:MCS:=VueFileAttente~VuePartie~∅} {1:MCS:=vueFileAttente~vuePartie~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(created(VueFileAttente.class));~inputs.get(created(VuePartie.class));~new VueFileAttente()~new VuePartie()~∅}
		  
		 {1:MCS:=vueRacine.~VueRacine.~vueDessin.~vueFileAttente.~VueDessin.~VueFileAttente.~∅}{1:MCS:=afficherSousVue~∅}{1:MCS:=(vueFileAttente);~(vueRacine);~(vueDessin);~(vuePartie);~∅}
	 });
</pre>
</code>
