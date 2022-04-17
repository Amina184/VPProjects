import java.util.ArrayList;

public class livre {

	emprunt emprunt;
	private int idLivre;
	private String titre;
	private String description;
	private String etat;
	public ArrayList<livre> T ;
	
	

	/**
	 * @param idLivre
	 * @param titre
	 * @param description
	 * @param etat
	 */
	public livre(int idLivre, String titre, String description, String etat) {
		this.idLivre = idLivre;
		this.titre = titre;
		this.description = description;
		this.etat = etat;
		this.T = new ArrayList<livre>();
		T.add(new livre(idLivre, titre,  description, etat));
	}

	public String getEtat() {
		return this.etat;
	}

	/**
	 * 
	 * @param etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	

	/**
	 * 
	 * @param titre
	 */
	public String getTitre() {
		return this.titre;
	}
	
	public void setTitre(String titre) {
		this.titre = titre;
	}


	/**
	 * @return the t
	 */
	public ArrayList<livre> getT() {
		return T;
	}

	

	@Override
	public boolean equals(Object obj) {
		livre other = (livre) obj;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}
	
	

}