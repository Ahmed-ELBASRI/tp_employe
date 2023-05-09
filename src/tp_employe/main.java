package tp_employe;

public class main {

	public static void main(String[] args) {
//		Representant v = new Representant("el basri","ahmed",21,"20-04-2023",10000);
//		System.out.println(v.getNom());
//		System.out.println(v.calculeSalaire());
		Personnel p1=new Personnel();
		Vendeur v1=new Vendeur("Mokhlis","karim",22,"10/05/2001",10000);
		Producteur pro1=new Producteur("Elouadi","Amine",21,"01/02/2002",3000);
		Representant rep1=new Representant("Sbaii","Ahmed",30,"10/04/1999",100);
		ManuRisk mr1=new ManuRisk("Elouadi","Hamza",22,"23/02/2001",50);
		p1.ajouterEmploye(v1);
		p1.ajouterEmploye(pro1);
		p1.ajouterEmploye(rep1);
		p1.ajouterEmploye(mr1);
		p1.calculeSalaire();
		System.out.println(p1.salaireMoyenne());


	}

}
