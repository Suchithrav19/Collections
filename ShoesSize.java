package com.xworkz.collection;
import java.util.*;
public class ShoesSize {

	public static void main(String[] args) {
		int shoes1=28;
		int shoes2=30;
		int shoes3=32;
		int shoes4=34;
		int shoes5=36;
		int shoes6=38;
		int shoes7=40;
		int shoes8=42;
		int shoes9=44;
		int shoes10=32;
		int shoes11=34;
		int shoes12=36;
		int shoes13=38;
		int shoes14=34;
		int shoes15=32;
		
		Collection<Integer> shoe=new ArrayList<Integer>();
		shoe.add(shoes1);
		shoe.add(shoes2);
		shoe.add(shoes3);
		shoe.add(shoes4);
		shoe.add(shoes5);
		shoe.add(shoes6);
		shoe.add(shoes7);
		shoe.add(shoes8);
		shoe.add(shoes9);
		shoe.add(shoes10);
		shoe.add(shoes11);
		shoe.add(shoes12);
		shoe.add(shoes13);
		shoe.add(shoes14);
		shoe.add(shoes15);
		System.out.println(shoe);
		System.out.println(shoe.size());
		System.out.println();
		System.out.println("Accesing the collection data using Integer datatype");
		
		for(int sho:shoe)
		{
			System.out.println(sho);
		}
		System.out.println();
		System.out.println("Iterator by using Integer datatype");
		Iterator<Integer> shoes=shoe.iterator();
		while(shoes.hasNext())
		{
			System.out.println(shoes.next());
		}
		
		shoe.clear();
	}

}
