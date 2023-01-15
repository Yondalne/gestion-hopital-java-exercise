package univ;
import java.util.ArrayList;

public class Faculte {
	
	public String nom;
	public ArrayList<Employe> employes = new ArrayList<>();
	public Institut institut;
	
	public Faculte(String n, Institut institut) {
		this.nom = n;
		this.institut = institut;
	}

	public void addEmploye(Employe employe) {
		this.employes.add(employe);
	}
}
