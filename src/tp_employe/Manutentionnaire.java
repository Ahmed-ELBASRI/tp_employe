package tp_employe;

public class Manutentionnaire extends Employe {
	private int NBRH;
	public Manutentionnaire(String nom,String prenom,int age,String dateEntreeService,int NBRH) {
		super(nom,prenom,age,dateEntreeService);
		this.NBRH=NBRH;
	}
	public float calculeSalaire() {
		float salaire=(float)(NBRH*65);
		return salaire;
	}
	public String getProfession() {
		return "Manutentionnaire";
	}

}
