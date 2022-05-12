---
title: ""
weight: 1
bookHidden: true
---


# Migrer vers `Ntro` version `0.6`

* On va aussi retirer les dépendances à `JSweet`
    * (c'est spécifique à la Web de `Ntro`, qu'on n'utilise pas dans le cours)


# Modifier `gradle.properties`

1. Dans `tutoriels`, je modifie `gradle.properties`

        ntroVersion=0.6

1. Je fais la même chose pour `mon_projet/gradle.properties`



# Modifier `settings.gradle`

1. Dans `tutoriels`, je modifie `settings.gradle`

1. Je supprime les lignes marquées d'un `-` ci-bas


        buildscript {

            repositories {
	            mavenCentral()
	    -        maven { url "http://repository.jsweet.org/artifactory/libs-release-local" }
	    -        maven { url "http://repository.jsweet.org/artifactory/libs-snapshot-local" }
	    -        maven { url "http://repository.jsweet.org/artifactory/plugins-release-local" }
	    -        maven { url "http://repository.jsweet.org/artifactory/plugins-snapshot-local" }
	    -        maven { url "http://google-diff-match-patch.googlecode.com/svn/trunk/maven" }
	            maven {url "https://plugins.gradle.org/m2/"}
            }

            dependencies {
	    -        classpath('org.jsweet:jsweet-gradle-plugin:3.1.0') { 
		-            transitive = true 
	    -        }

                classpath 'org.openjfx:javafx-plugin:0.0.10'
            }
        }

1. Devrait donner

        buildscript {

            repositories {
	            mavenCentral()
	            maven {url "https://plugins.gradle.org/m2/"}
            }

            dependencies {
                classpath 'org.openjfx:javafx-plugin:0.0.10'
            }
        }


1. Je fais la même chose pour `mon_projet/settings.gradle`


# Modifier `build.gradle`

1. Dans `tutoriels/pong`, je modifie le fichier `build.gradle`

1. Je supprime la ligne marquée d'un `-`

        plugins {
            id 'localJavaPlugin'
        -    id 'localJSweetPlugin'
            id 'localFxPlugin'
        }

1. Devrais donner

        plugins {
            id 'localJavaPlugin'
            id 'localFxPlugin'
        }

1. Je fais la même chose pour `mon_projet/MON_JEU/settings.gradle`

# Je recrée le projet Eclipse


1. Dans `tutoriels`, je recrée le projet Eclipse

        $ cd tutoriels
        $ sh gradlew build
        $ sh gradlew eclipse

1. En Eclipse, je rafraîchis ou ré-importe le projet

1. Je fais la même chose pour `mon_projet`


# En cas d'erreurs bizarres avec Eclipse

1. Je suis cette <a href="/cegep/420-4F5-MO/procedures/eclipse">procédure</a>
