package univ;
import java.util.ArrayList;
import java.util.Date;

public class Projet {
	
	public String nom;
	public Date debut;
	public Date fin;
	
	public ArrayList<AssocieRecherche> associes = new ArrayList<>();
	static ArrayList<Projet> TousLesProjets = new ArrayList<>();
	
	public Projet(String nom, Date debut, Date fin) {
		super();
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
		TousLesProjets.add(this);
	}
	
	public void addAssocie(AssocieRecherche a) {
		this.associes.add(a);
	}
}
