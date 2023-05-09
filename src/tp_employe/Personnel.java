package tp_employe;
import java.util.*;
public class Personnel {
	private Employe [] emps;
	static int cpt=0;
	public Personnel(int n) {
		emps = new Employe[n];
	}
	public void ajouterEmploye(Employe e) {
		emps[cpt]=e;
		cpt++;
	}
	public void calculeSalaire() {
		for(int i=0; i<cpt;i++) {
			emps[i].calculeSalaire();
		}
	}
}
