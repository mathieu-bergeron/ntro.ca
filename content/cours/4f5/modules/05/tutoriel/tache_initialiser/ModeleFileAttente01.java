public class ModeleFileAttente implements Model {

    // ...
	
    public void initialiser() {
		Date maintenant = new Date();
		horodatageOuverture = maintenant.getTime();

		System.out.println("[ModeleFileAttente] "  + new SimpleDateFormat("EEEE dd MMMM, HH:mm").format(maintenant));
    }
