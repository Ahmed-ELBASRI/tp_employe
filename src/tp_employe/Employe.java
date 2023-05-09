package tp_employe;

abstract public class Employe {
	private String nom;
	private String prenom;
	private int age;
	private String dateEntreeService;
	
	public Employe(String nom,String prenom,int age,String dateEntreeService) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.dateEntreeService=dateEntreeService;
	}
	public String getProfession() {
		return "Employe";
	}
	public String getNom() {
		return getProfession()+nom;
	}
	public abstract float calculeSalaire();
	
}
