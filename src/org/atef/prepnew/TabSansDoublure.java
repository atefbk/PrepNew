package org.atef.prepnew;

import java.util.Arrays;

public class TabSansDoublure {
/**
 * Etant donné un tableau d'entiers contenant des doublants, on veut retourner
 * un tableau simplifié: pas de redondances 
 */
	
	public static void main(String[] args) {
		int[] data = {5, 9, 8, 7, 8, 2, 5, 1};
		TabSansDoublure tabsd = new TabSansDoublure();
		int[] result = tabsd.simplifier(data);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public int[] simplifier(int[] data) {
		
		if (data.length == 1) return data;	
		
		int[] preResult = new int[data.length];		
		preResult[0] = data[0];
		
		int j = 0;
		for (int element : data) {
			if(!existe(element, preResult)) {				
				j++;
				preResult[j] = element;
			}
		}
		
		int[] result  = new int[j+1];
		
		int k = 0;
		while(k <= j){
			result[k] = preResult[k];
			k++;
		}
		
		return result;		
	}
	
	public boolean existe(int e, int[] tab) {
		
		return Arrays.toString(tab).contains(Integer.toString(e));
		/**
		 * Autre façon:
		 */
		// return (Arrays.toString(tab).indexOf(Integer.toString(3)) >= 0);
	}
}
