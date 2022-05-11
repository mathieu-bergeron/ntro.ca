# Tutoriel 1: sur mon Windows

<center>
<video width="50%" src="mon_windows.mp4" type="video/mp4" controls>
</center>


## Installer Git

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
Rappel: ne pas effectuer cette étape sur un Windows du Collège
</div>
</center>

<br>
<br>



1. J'installe Git
	* Je visite <a href="https://git-scm.com/download/win" target="_blank">https://git-scm.com/download/win</a>
	* Je télécharge et j'exécute `Git-2.34.1-64-bit.exe`
	* J'installe avec les options par défaut, **sauf**:
		* Je choisis `nano` comme éditeur si je n'aime pas `vim`:

<center>
<img width="50%" src="git_vim.png"/>
</center>


## Installer le JDK 11
<div style="float:right">(je peux aussi utiliser <code>openjdk-11</code>)&nbsp;&nbsp;&nbsp;</div>

<br>
<br>
<br>

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
Rappel: ne pas effectuer cette étape sur un Windows du Collège
</div>
</center>

<br>
<br>

1. Si j'en ai pas besoin, je désinstalle le JDK 1.8 (et tout autre JDK **sauf 11**)

1. Si ce n'est pas déjà fait, j'installe le **JDK 11**

	* Si ce n'est pas déjà fait, je me crée un compte Oracle: <a href="https://profile.oracle.com/myprofile/account/create-account.jspx" target="_blank">https://profile.oracle.com/myprofile/account/create-account.jspx</a>
	
	* Je visite <a href="https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html" target="_blank">https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html</a>
	* Je télécharge la version  *Windows x64 Installer*
	    * `jdk-11.0.13_windows-x64_bin.exe`
	* J'accepte la licence et je clique sur *Download*
	* J'exécute `jdk-11.0.13_windows-x64_bin.exe`
	* J'installe avec les options par défaut


## Installer Eclipse 2021-06 (ou plus récent)

<center>
<div style="background-color:orange;width:80%;border:2px dashed black;padding:10px">
Rappel: ne pas effectuer cette étape sur un Windows du Collège
</div>
</center>

<br>
<br>

1. Si j'en ai pas besoin, je désinstalle mon ancienne version d'Eclipse

1. J'installe Eclipse (version *2021-06* ou plus récent)
	* Je visite <a href="https://www.eclipse.org/downloads/">https://www.eclipse.org/downloads/</a>
	* Je télécharge en cliquant sur <i>Download x86_64</i>
	* J'exécute `eclipse-inst-win64.exe`
	* J'installe *Eclipse IDE for Java Developers* avec les options par défaut


$[embed ./installer_gradle]()

$[embed ./configurer_eclipse]()

$[embed ./configurer_home]()

$[embed ./tester_environnement]()

