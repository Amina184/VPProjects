import utilisateurs.*;
import java.util.*;

public class emprunt {

	bibliothécaire bibliothecaire;
	emprunteur emprunteur;
	livre emprunt;
	private int idE;
	private Date dateEmprunt;
	private Date dateRetour;
	/**
	 * @return the dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}
	
	/**
	 * @return the dateRetour
	 */
	public Date getDateRetour() {
		return dateRetour;
	}
	/**
	 * @param dateRetour the dateRetour to set
	 */
	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

}