package univ;

public abstract class Employe {

	public static int compteur = 0;
	public int ssNo;
	public String nom;
	public String email;
	
	public Faculte fac;
	
	public Employe(int ssNo, String nom, String email, Faculte fac) {
		this.ssNo = ssNo;
		this.nom = nom;
		this.email = email;
		this.fac = fac;
		compteur++;
	}
	
}
