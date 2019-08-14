package org.atef.prepnew;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Obj {
	private int nbr;
	
	public Obj(int nbr) {
		this.nbr = nbr;
	}
	
}
public class Eval {
	private String nom;
	

	public Eval(String nom) {
		this.nom = nom;
	}

	public static void main(String[] args) {
	
		List<String> lstStr = new ArrayList<>(); 
		lstStr.add("Roon");
		lstStr.add("Fatimaa");
		lstStr.add("Atefo");

		List<String> result = lstStr.stream().filter(e -> e.contains("Rawen"))
									 .collect(Collectors.toList());
		result.forEach(e -> System.out.println(e));
		
		
	}

}
