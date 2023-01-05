package com.xworkz.collection;
import java.util.*;
public class Animals {

	public static void main(String[] args) {
	String anim1="Camel";	
	String anim2="Fox";
	String anim3="Wolf";
	String anim4="Elephant";
	String anim5="Tiger";
	String anim6="Lion";
	String anim7="Monkey";
	String anim8="Donkey";
	String anim9="Dog";
	String anim10="Cat";
	
	Collection<String> ani=new ArrayList<String>();
    ani.add(anim1);
    ani.add(anim2);
    ani.add(anim3);
    ani.add(anim4);
    ani.add(anim5);
    ani.add(anim6);
    ani.add(anim7);
    ani.add(anim8);
    ani.add(anim9);
    ani.add(anim10);
    System.out.println(ani+" \n"+ani.size());
    
    System.out.println();
	for(String animal:ani)
	{
		System.out.println(animal);
	}
	System.out.println();
	System.out.println("Iterator method is used");
	Iterator<String> animals=ani.iterator();
	while(animals.hasNext())
	{
		System.out.println(animals.next());
	}
	}

}

