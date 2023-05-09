package tp_employe;

public class Producteur extends Employe {
	private int NBRP;
	public Producteur(String nom,String prenom,int age,String dateEntreeService,int NBRP) {
		super(nom,prenom,age,dateEntreeService);
		this.NBRP=NBRP;
	}
	@Override
	public float calculeSalaire() {
		float salaire=(float)(NBRP*5);
		return salaire;
	}
	public String getProfession() {
		return "Producteur";
	}

}
