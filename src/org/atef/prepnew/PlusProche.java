package org.atef.prepnew;

public class PlusProche {
	/**
	 * Etant donn� un tableau d'entiers sans redondances, retourner l'�lement la plus proche de zero
	 * En cas de deux �lements � m�me distance, retourner l'�lement � valeur positive
	 */

	public static void main(String[] args) {
		
		int[] tab = {9, -3, 7, 3};
		System.out.println(plusProche(tab));
	}
	
	public static int plusProche(int[] tab) {
		if (tab.length == 1) return tab[0];
		int result = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (valAbs(tab[i]) < valAbs(result))
				result = tab[i];
			if (valAbs(tab[i]) == valAbs(result)) {
				if (tab[i] > result) result = tab[i];
			}
		}
		return result;
	}
	
	public static int valAbs(int x) {
		return (x < 0) ? -x : x;
	}
	
	

}
