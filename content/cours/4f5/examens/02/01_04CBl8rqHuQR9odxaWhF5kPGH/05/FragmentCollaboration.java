public class {1:MCS:=FragmentCollaboration~VueDessin~VueFileAttente~FragmentCollaborateur~ModeleFileAttente~ModeleDesssin~Collaboration~Collaborateur} extends {1:MCS:=ViewFx~Value~Model~Fragment} {

    private void {1:MCS:=installerMsgAjouterCollaborateur~installerMsgAjouterCollaboration}() {

        {1:MCS:=MsgAjouterCollaborateur~MsgAjouterCollaboration} {1:MCS:=msgAjouterCollaborateur~msgAjouterCollaboration} = NtroApp.newMessage({1:MCS:=MsgAjouterCollaborateur.class~MsgAjouterCollaboration.class});
        
        {1:MCS:=boutonAjouterCollaborateur~boutonAjouterCollaboration}.setOnAction(evtFx -> {

            {1:MCS:=msgAjouterCollaborateur~msgAjouterCollaboration}.{1:MCS:=setCollaborateur~setCollaboration}({1:MCS:this~=∅}{1:MCS:=new Collaborateur(~new Collaboration(~∅}{1:MCS:=Session.nomUsager~nomAleatoire()~∅}{1:MCS:=, Session.forme~, formeAleatoire()~∅}{1:MCS:=)~∅}));

            {1:MCS:=msgAjouterCollaborateur~msgAjouterCollaboration}.send();
        });
    }
