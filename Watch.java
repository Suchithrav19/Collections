package com.xworkz.collection;
import java.util.*;
public class Watch {
	
public static void main(String args[])
{
	String watch1="ROLEX";
	String watch2="Fast Track";
	String watch3="HMT";
	String watch4="Luzery";
	String watch5="IPhone";
	
	Collection<String> watch=new ArrayList<String>(); 
    watch.add(watch1);
    watch.add(watch2);
    watch.add(watch3);
    watch.add(watch4);
    watch.add(watch5);
    System.out.println(watch);
    System.out.println();
    for(String wat:watch)
    {
    	System.out.println(wat);
    }
    System.out.println();
    System.out.println("By using the iterator");
    Iterator<String> watches=watch.iterator();
    while(watches.hasNext())
    {
    	System.out.println(watches.next());
    }
	
}
}
