# Pour contrôler l'écran des utilisateurs

https://docs.microsoft.com/en-us/answers/questions/8761/request-control-during-screen-share-ubuntu-180404.html


        $ vim .config/Microsoft/Microsoft\ Teams/settings.json

                enableScreenSharingToolbar:"true"



# Pour ne pas afficher le rectangle rouge

https://docs.microsoft.com/en-us/answers/questions/42095/sharing-screen-not-working-anymore-bug.html

Renommer le fichier 

        /usr/share/teams/resources/app.asar.unpacked/node_modules/slimcore/bin/rect-overlay

pour que Teams ne puisse pas l'utiliser

#
