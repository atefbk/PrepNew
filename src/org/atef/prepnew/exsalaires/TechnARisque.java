package org.atef.prepnew.exsalaires;


public class TechnARisque extends Technicien implements ARisque {
	 
    public TechnARisque(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date, unites);
    }
 
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME;
    }
}
