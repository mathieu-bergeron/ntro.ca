---
title: ""
weight: 1
bookHidden: true
---


Considérer l'application d'agenda partagé.

<center>
<video src="https://ciboulot.ca/cegep/420-4F5-MO/examens/01/B_ZoQvBKRUdoiU8Md8XQmT/examen01B.mp4" type="video/mp4" loop nocontrols autoplay>
</center>

Compléter le code `.java` nécessaire à naviguer vers la page file d'attente.

Choisir `∅` si une option n'est pas utile.


<br>
<br>
<br>
<br>



* Dans `{1:MCS:VueAgenda~VueFileAttente~VueRacine~Navigation~=FrontalAgenda~Initialisation~EvtAfficherFileAttente~EvtAfficherVueAgenda~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant


<code>
<pre>
@Override
public void registerEvents(EventRegistrar registrar) {
	registrar.registerEvent({1:MCS:=EvtAfficherFileAttente.class~EvtAfficherVueAgenda.class~EvtAfficherPartie.class~EvtAfficherVueRacine.class~EvtAfficherVueRacine~EvtAfficherFileAttente~EvtAfficherFileAttente~EvtAfficherPartie});
}
</pre>
</code>

<br>
<br>


* Dans `{1:MCS:=VueAgenda~VueFileAttente~VueRacine~Navigation~FrontalAgenda~Initialisation~EvtAfficherFileAttente~EvtAfficherVueAgenda~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
{1:MCS:=EvtAfficherFileAttente~EvtAfficherVueAgenda~EvtAfficherPartie~EvtAfficherVueRacine} evtNtro = NtroApp.newEvent({1:MCS:=EvtAfficherFileAttente.class~EvtAfficherVueAgenda.class~EvtAfficherPartie.class~EvtAfficherFileAttente~EvtAfficherFileAttente~EvtAfficherPartie~EvtAfficherVueRacine~EvtAfficherVueRacine.class});

boutonRetour.setOnAction({1:MCS:=evtFx~evtNtro} -> {

	{1:MCS:=evtNtro~evtFx}.trigger();
});
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueAgenda~VueFileAttente~VueRacine~=Navigation~FrontalAgenda~Initialisation~EvtAfficherFileAttente~EvtAfficherVueAgenda~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.taskGroup({1:MCS:="Navigation"~"Initialisation"~"AfficherVueFileAttente"~"AfficherVueAgenda"})

	 {1:MCS:=.waitsFor~∅}{1:MCS:=("Initialisation")~("Navigation")~("AfficherFileAttente")~("AfficherAgenda")~∅}

	 .andContains(subTasks -> {

		 {1:MCS:=creerVueFileAttente~creerVueAgenda~∅}{1:MCS:=(subTasks);~(tasks);~∅}
		 {1:MCS:=afficherVueFileAttente~afficherVueAgenda~∅}{1:MCS:=(subTasks);~(tasks);~∅}

	 });
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueAgenda~VueFileAttente~VueRacine~=Navigation~FrontalAgenda~Initialisation~EvtAfficherFileAttente~EvtAfficherVueAgenda~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.task(create({1:MCS:=VueFileAttente.class~VueAgenda.class~VuePartie.class~VueFileAttente~VueAgenda~VuePartie}))

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(viewLoader(VueFileAttente.class))~(viewLoader(VueAgenda.class))~(viewLoader(VuePartie.class))~(viewLoader(VueAgenda))~(viewLoader(VueFileAttente))~(viewLoader(VuePartie))~∅}

	 .thenExecutesAndReturnsValue(inputs -> {
		 
		 {1:MCS:=ViewLoader〈VueFileAttente〉~ViewLoader〈VueAgenda〉~ViewLoader〈VuePartie〉~~~~∅} {1:MCS:=viewLoader~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(viewLoader(VueFileAttente.class));~inputs.get(viewLoader(VueAgenda.class));~inputs.get(viewLoader(VuePartie.class));~new ViewLoader〈VueFileAttente〉();~new ViewLoader〈VueAgenda〉();~new ViewLoader〈VuePartie〉();~∅}
		 
		 return {1:MCS:new~=∅}{1:MCS:=viewLoader.createView()~VueFileAttente()~VueAgenda()~VuePartie()~∅};
	 });
</pre>
</code>

<br>
<br>

* Dans `{1:MCS:VueAgenda~VueFileAttente~VueRacine~=Navigation~FrontalAgenda~Initialisation~EvtAfficherFileAttente~EvtAfficherVueAgenda~VuePartie~EvtAfficherVueRacine}`, ajouter le code suivant

<code>
<pre>
tasks.task({1:MCS:="afficherVueFileAttente"~"afficherVuePartie"~"afficherVueAgenda"})

	 {1:MCS:.waitsFor~=∅}{1:MCS:(created(VueRacine.class))~(created(VueAgenda.class))~=∅}

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(created(VueFileAttente.class))~(created(VuePartie.class))~∅}

	 {1:MCS:=.waitsFor~∅}{1:MCS:=(event(EvtAfficherFileAttente.class))~(event(EvtAfficherVueAgenda.class))~(event(EvtAfficherPartie.class))~(event(EvtAfficherVueRacine.class))~∅}

	 .thenExecutes(inputs -> {

		 {1:MCS:=VueRacine~VueAgenda~∅} {1:MCS:=vueRacine~vueAgenda~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(created(VueRacine.class));~inputs.get(created(VueAgenda.class));~new VueRacine()~new VueAgenda()~∅}
		 {1:MCS:=VueFileAttente~VuePartie~∅} {1:MCS:=vueFileAttente~vuePartie~∅} {1:MCS:=&#61;~∅} {1:MCS:=inputs.get(created(VueFileAttente.class));~inputs.get(created(VuePartie.class));~new VueFileAttente()~new VuePartie()~∅}
		  
		 {1:MCS:=vueRacine.~VueRacine.~vueAgenda.~vueFileAttente.~VueAgenda.~VueFileAttente.~∅}{1:MCS:=afficherSousVue~∅}{1:MCS:=(vueFileAttente);~(vueRacine);~(vueAgenda);~(vuePartie);~∅}
	 });
</pre>
</code>
