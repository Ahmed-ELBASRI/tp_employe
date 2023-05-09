package tp_employe;

abstract public class Commercial extends Employe{
	private float chiffreAffaire;
	public float getChiffreAffaire() {
		return chiffreAffaire;
	}
	public Commercial(String nom,String prenom,int age,String dateEntreeService,float chiffreAffaire) {
		super(nom,prenom,age,dateEntreeService);
		this.chiffreAffaire=chiffreAffaire;
	}

}
