package com.xworkz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		String sw1 ="Champakali ";
		String sw2 ="Barfi ";
		String sw3 ="Kaju ";
		String sw4 ="Laddu ";
		String sw5 ="Jalebi ";
		String sw6 ="Gulab Jamun ";
		String sw7 =" Peda";
		String sw8 ="Darwad Peda ";
		String sw9 ="Rasmalai ";
		String sw10 ="Rasgulla ";
		String sw11 ="Carrot Halwa ";
		String sw12="Sompampudi ";
		String sw13 ="PanCake ";
		
		Collection<String> coll =new ArrayList<String>(); 
		
		coll.add(sw1);
		coll.add(sw2);
		coll.add(sw3);
		coll.add(sw4);
		coll.add(sw5);
		coll.add(sw6);
		coll.add(sw7);
		coll.add(sw8);
		coll.add(sw9);
		coll.add(sw10);
		coll.add(sw11);
		coll.add(sw12);
		coll.add(sw13);
		coll.add(sw13);
		
		System.out.println("Before clear ");
		System.out.println(coll);
		System.out.println(coll.size());
		
		System.out.println("After clear \n");
		
		for(String element:coll)
		{
			System.out.println(element);
		}
		System.out.println();
		System.out.println("*******Iterator********");
				Iterator<String> refl=coll.iterator();
		while(refl.hasNext())
		{
			System.out.println(refl.next());
		}
		
		
		coll.clear();
		
	}

}

