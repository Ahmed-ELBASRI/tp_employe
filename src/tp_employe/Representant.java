package tp_employe;

public class Representant extends Commercial {
	public Representant(String nom,String prenom,int age,String dateEntreeService,float chiffreAffaire) {
		super(nom,prenom,age,dateEntreeService,chiffreAffaire);
	}
	public float calculeSalaire() {
		float salaire=(float)(super.getChiffreAffaire()*0.2)+800;
		return salaire;
	}
	public String getProfession() {
		return "Representant";
	}
}
