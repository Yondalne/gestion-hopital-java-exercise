package univ;
import java.util.ArrayList;

public class AssocieRecherche extends Employe {
	
	public String champEtude;
	public ArrayList<Projet> projets = new ArrayList<>();
	
	public AssocieRecherche(int ssNo, String nom, String email, Faculte fac, String field) {
		super(ssNo, nom, email, fac);
		this.champEtude = field;
	}
	
	public void addProjet(Projet p) {
		this.projets.add(p);
	}

}
