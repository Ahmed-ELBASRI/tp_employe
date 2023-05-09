package tp_employe;

public class ManuRisk extends Manutentionnaire implements EmpRisk{
	public ManuRisk(String nom,String prenom,int age,String dateEntreeService,int NBRH) {
		super(nom,prenom,age,dateEntreeService,NBRH);
	}
	public float calculeSalaire() {
		return super.calculeSalaire()+prime;
	}
	public String getProfession() {
		return "Manutentiaire risk";
	}

}	
