package org.atef.prepnew.exsalaires;

public class ManutARisque extends Manutentionnaire implements ARisque {
	 
    public ManutARisque(String prenom, String nom, int age, String date, int heures) {
        super(prenom, nom, age, date, heures);
    }
 
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
