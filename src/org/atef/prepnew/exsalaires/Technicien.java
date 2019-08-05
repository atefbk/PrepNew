package org.atef.prepnew.exsalaires;


public class Technicien extends Employe {
    private final static double FACTEUR_UNITE = 5.0;
    private int unites;
 
    public Technicien(String prenom, String nom, int age, String date, int unites) {
        super(prenom, nom, age, date);
        this.unites = unites;
    }
 
    public double calculerSalaire() {
        return FACTEUR_UNITE * unites;
    }
 
    public String getTitre()
        {
            return "Le technicien ";
        }
}