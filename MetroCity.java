package com.xworkz.collection;
import java.util.*;
public class MetroCity {

	public static void main(String[] args) {
		String city1="Banglore";
		String city2="Hyderbad";
		String city3="Mumbi";
		String city4="Channai";
		String city5="Delhi";
		
		Collection<String> city=new ArrayList<String>();
		city.add(city5);
		city.add(city4);
		city.add(city3);
		city.add(city2);
		city.add(city1);
		
		System.out.println(city+" \n"+city.size());
		System.out.println();
		for(String cit:city)
		{
			System.out.println(cit);
		}
		System.out.println();
		System.out.println("Iterator method is used");
		Iterator<String> cities=city.iterator();
		while(cities.hasNext())
		{
			System.out.println(cities.next());
		}
	}

}
