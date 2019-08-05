package org.atef.prepnew;


class Solution {
	
	public static void main(String[] args) {
		
	}
	
	public char scanChar(String s) {
		
		int i = 1;
		for( char x = 'A'; i <= 26; x++, i++ ) {
			if (s == printChar(x)) return x;			
		}
		
		return '?';
	}
	
	public String printChar(char c) {
		return "###";
	}

}
