package org.atef.prepnew;

public class TwinWords {

	public static void main(String[] args) {
		
		String s1 = "abidal", s2 = "labidb";
		System.out.println(twins(s1, s2));
	}
	
	public static boolean twins(String s1, String s2) {
		if ((s1.length() == s2.length()) && (s1.length() > 0)){
			char[] s1Tab = s1.toCharArray();
			char[] s2Tab = s2.toCharArray();
			int match = 0;
			for (char c : s1Tab) {
				if (nbrOcuurences(c, s1Tab) == nbrOcuurences(c, s2Tab)) match++;
			}
			if (match == s1.length()) return true;  
		}
		return false;
	}
	
	public static int nbrOcuurences(char c, char[] tab) {
		int nbr = 0;
		for (char d : tab) {
			if (d == c) nbr++;
		}
		return nbr;
	}

}
