package univ;

public class index {

	public static void main(String[] args) {
		
		Cours c1 = new Cours(0, "Java et UML", 24);
//		Cours.TousLesCours.add(c1);
		
		Cours c2 = new Cours(1, "JEE", 48);
//		Cours.TousLesCours.add(c2);
		
		Cours c3 = new Cours(2, "Data Structure and Algorithm", 48);
//		Cours.TousLesCours.add(c3);
		
		Institut i1 = new Institut("ESATIC", "Treichville non loin de Bernabe");
		Faculte f1 = new Faculte("Computer Science", i1);
		Faculte f2 = new Faculte("Recherche", i1);
		
		Conferencier conf1 = new Conferencier(15, "Dr Konan Hyacinthe", "konanhyacinthe@gmail.com", "Software Engineer", f1);
//		Conferencier.TousLesConferenciers.add(conf1);
		
		Conferencier conf2 = new Conferencier(15, "M N'Drin Hugues", "esandrin@gmail.com", "Software Engineer", f2);
//		Conferencier.TousLesConferenciers.add(conf2);
		
		conf2.addCours(c3);
		conf2.addCours(c2);
		conf1.addCours(c2);
		conf1.addCours(c1);
		
		Projet p1 = new Projet("Former des ingenieurs", null, null);
		conf2.addProjet(p1);
		
		Cours.showAllCours();
		Conferencier.showAllConf();
	}

}
