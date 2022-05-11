package agenda.modeles.valeurs;

import ca.ntro.app.models.Value;

public class Rencontre implements Value {
	
	private long horodatageDebut;
	private long horodatageFin;

	public long getHorodatageDebut() {
		return horodatageDebut;
	}

	public void setHorodatageDebut(long horodatageDebut) {
		this.horodatageDebut = horodatageDebut;
	}

	public long getHorodatageFin() {
		return horodatageFin;
	}

	public void setHorodatageFin(long horodatageFin) {
		this.horodatageFin = horodatageFin;
	}
	
	public Rencontre() {
		
	}
	
	

}
