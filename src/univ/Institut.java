package univ;
import java.util.ArrayList;

public class Institut {
	
	public String nom;
	public String adresse;
	public ArrayList<Faculte> facultes = new ArrayList<>();
	
	public ArrayList<AssocieRecherche> associes = new ArrayList<>();
	
	public Institut(String nom, String adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public void addAssocie(AssocieRecherche associe) {
		this.associes.add(associe);
	}
	
	public void addFculte(Faculte fac) {
		this.facultes.add(fac);
	}
	
}
