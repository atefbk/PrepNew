package org.atef.prepnew;

public class PlusProche {
	
public static void main(String[] args) {
        int tabb[] = {};
        System.out.println(plusProcheDeZero(tabb));

}
    public static int plusProcheDeZero(int[] tab){
        if ((tab.length > 0) && (tab[0] != 0)) {
            int result = tab[0];
            if (tab.length>1){
                //System.out.println("Entrée dans la boucle !!!");
                for (int i = 1; i<tab.length; i++) {
                    //System.out.println("Parcouru: "+i);
                    if(tab[i] == 0) return 0;
                    if ((Math.abs(tab[i]) < result)
                            || ((tab[i] + result == 0) && (result < tab[i]))){
                        result = tab[i];
                    }
                }
            }
            return result;
        }
        return 0;
    }
	

}
