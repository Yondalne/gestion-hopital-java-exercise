package univ;
import java.util.ArrayList;

public class Conferencier extends AssocieRecherche {

	static ArrayList<Conferencier> TousLesConferenciers = new ArrayList<Conferencier>();
	public ArrayList<Cours> cours = new ArrayList<>();
	
	
	public Conferencier(int ssNo, String nom, String email, String field, Faculte fac) {
		super(ssNo, nom, email, fac, field);
		
		TousLesConferenciers.add(this);
	}
	
	public void addCours(Cours c) {
		this.cours.add(c);
		c.addConferencier(this);
	}
	
	public static void showAllConf() {
		Conferencier leconf;
		for (int i = 0; i < TousLesConferenciers.size(); i++) {
			System.out.println("Conferencier "+ i +" : "+ TousLesConferenciers.get(i).nom);
			leconf = TousLesConferenciers.get(i);
			
			System.out.println("Faculte : " + leconf.fac.nom + " de L'institut " + leconf.fac.institut.nom + "\n");
		}
	}

}
