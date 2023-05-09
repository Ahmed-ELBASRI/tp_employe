package tp_employe;
import java.util.*;
public class Personnel {
	private Employe [] emps;
	private int cpt;
	private int n=100;
	public Personnel() {
		emps = new Employe[n];
	}
	public void ajouterEmploye(Employe e) {
		if(cpt==n) {
			System.out.println("out of bound");
			return;
		}
		emps[cpt]=e;
		cpt++;
	}
	public void calculeSalaire() {
		for(int i=0; i<cpt;i++) {
			System.out.println(emps[i].calculeSalaire());
		}
	}
	public double salaireMoyenne() {
		double somme = 0;
		for(int i=0; i<cpt;i++) {
			somme+=emps[i].calculeSalaire();
		}
		return somme/cpt;
	}
}
