package tp_employe;

public class Vendeur extends Commercial {
	public Vendeur(String nom,String prenom,int age,String dateEntreeService,float chiffreAffaire) {
		super(nom,prenom,age,dateEntreeService,chiffreAffaire);
	}
	public float calculeSalaire() {
		float salaire=(float)(super.getChiffreAffaire()*0.2)+400;
		return salaire;
	}
	public String getProfession() {
		return "Vendeur";
	}
	
}
