package org.atef.prepnew.exsalaires;


class Representant extends Commercial {
    private final static double POURCENT_REPRESENTANT = 0.2;
    private final static int BONUS_REPRESENTANT = 800;
 
    public Representant(String prenom, String nom, int age, String date, double chiffreAffaire) {
        super(prenom, nom, age, date, chiffreAffaire);
    }
 
    public double calculerSalaire() {
        return (POURCENT_REPRESENTANT * getChiffreAffaire()) + BONUS_REPRESENTANT;
    }
 
    public String getTitre()
        {
            return "Le représentant ";
        }
}
 