package tp_employe;

public class ProdRisk extends Producteur implements EmpRisk {
	public ProdRisk(String nom,String prenom,int age,String dateEntreeService,int NBRH) {
		super(nom,prenom,age,dateEntreeService,NBRH);
	}
	public float calculeSalaire() {
		return super.calculeSalaire()+prime;
	}
	public String getProfession() {
		return "Producteur risk";
	}


}
