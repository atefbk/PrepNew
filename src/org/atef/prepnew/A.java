package org.atef.prepnew;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class A {
	
	
	   public static void main(String[] args) {
		int[] tableau = {13, 6, 9, 5, 21, 2};
		int element = 765;
		System.out.println(exists(tableau, element));
	}
	static boolean exists(int[] ints, int k) {
		
		List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
		return list.contains(new Integer(k));

		// List<Integer> liste = new ArrayList<>(Arrays.asList(ints)); 
//		boolean result = false;	
//			for (int i=0; i< ints.length; i++) {
//				if (ints[i] == k) return true;
//			}
//		return result;

	}
}