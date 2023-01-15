package univ;
import java.util.ArrayList;

public class Cours {
	public int id;
	public String nom;
	public float heures;
	
	public ArrayList<Conferencier> conferenciers = new ArrayList<>();
	
	static ArrayList<Cours> TousLesCours = new ArrayList<Cours>();
	
	public static void showAllCours() {
		Cours lecours;
		for (int i = 0; i < TousLesCours.size(); i++) {
			System.out.println("Cours "+ i +" : "+ TousLesCours.get(i).nom);
			System.out.print("Dispense par :");
			lecours = TousLesCours.get(i);
			for (int j = 0; j < lecours.conferenciers.size(); j++) {
				System.out.print(" "+ lecours.conferenciers.get(j).nom + " |");
			}
			System.out.println("\n");
		}
	}
	
	
	public Cours(int id, String nom, float heures) {
		super();
		this.id = id;
		this.nom = nom;
		this.heures = heures;
		
		TousLesCours.add(this);
	}
	
	public void addConferencier(Conferencier c) {
		this.conferenciers.add(c);
	}
	
	
}
