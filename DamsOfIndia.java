package com.xworkz.collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DamsOfIndia {

	public static void main(String[] args) {
		
		String dam1="Ganga";
		String dam2="Panchet Dam";
		String dam3="Durgapur Barrage";
		String dam4="Tapovan Vishnugad Dam";
		String dam5="Sri Komaram Bheem Project";
		String dam6="Mettur Dam";
		String dam7="Rangit Dam";
		String dam8="Kalisindh Dam";
		String dam9="Ranjit Sagar Dam";
		String dam10="Mandira Dam";
		String dam11="Serlui B Dam";
		String dam12="Radhanagari";
		String dam13="Tipaimukh Dam";
		String dam14="Kolar Dam";
		String dam15="Parambikulam";
		String dam16="Kanva Reservoir";
		String dam17="Konar Dam";
		String dam18="Chamera Dam";
		String dam19="Kaushalya Dam";
		String dam20="Sardar Sarovar Dam";
		String dam21="Chapoli Dam";
		String dam22="Chandan Dam";
		String dam23="Tandula Dam";
		String dam24="Ranganadi";
		String dam25="Kalyani Dam";
		String dam26="Vishnuprayag Dam";
		String dam27="Yellampalli";
		String dam28="Basava Sagara Dam";
		String dam29="Dudhawa Dam";
		
		
		Collection<String> dams=new ArrayList<String>();
		dams.add(dam29);
		dams.add(dam28);
		dams.add(dam27);
		dams.add(dam26);
		dams.add(dam25);
		dams.add(dam24);
		dams.add(dam23);
		dams.add(dam22);
		dams.add(dam21);
		dams.add(dam20);
		dams.add(dam19);
		dams.add(dam18);
		dams.add(dam17);
		dams.add(dam16);
		dams.add(dam15);
		dams.add(dam14);
		dams.add(dam13);
		dams.add(dam12);
		dams.add(dam11);
		dams.add(dam10);
		dams.add(dam9);
		dams.add(dam8);
		dams.add(dam7);
		dams.add(dam6);
		dams.add(dam5);
		dams.add(dam4);
		dams.add(dam3);
		dams.add(dam2);
		dams.add(dam1);
		
		System.out.println(dams+" \n"+dams.size());
		System.out.println();
		
		
		Iterator<String> dams1=dams.iterator();
		
		System.out.println("The dam starts with T : ");
		
		while(dams1.hasNext()) {
			String element = dams1.next();
		
		if(element.startsWith("T"))
		{
			System.out.println(element);
		}
		
		}
		System.out.println("\n");
			Iterator<String> dams2 = dams.iterator();
			System.out.println("Dam name End with ra : ");
			while(dams2.hasNext()) {
				String element = dams2.next();
				if( element.endsWith("ra")) {
					
					System.out.println(element);
					
				}
			}
			
	
	}
	
	

	
		
		
		
		
		

	}


