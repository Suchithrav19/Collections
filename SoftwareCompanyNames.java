package com.xworkz.collection;
import java.util.*;
public class SoftwareCompanyNames {

	public static void main(String[] args) {
	String cmp1="Wipro";
	String cmp2="Infosys";
	String cmp3="Accenture";
	String cmp4="TCS";
	String cmp5="IBM";
	String cmp6="Oracle";
	String cmp7="Cognizant";
	String cmp8= "Capgemini";
	String cmp9= "Cisco";
	String cmp10= "Mindtree";
	String cmp11= "HCL";
	String cmp12= "Mu Sigma";
	String cmp13= "Amazon";
	String cmp14= "Dell";
	String cmp15= "HP";
	String cmp16= "Tech Mahindra";
	String cmp17= "SAP";
	String cmp18= "Samsung R&D";
	String cmp19= "Virtusa";
	String cmp20= "Thomson Reuters";
	
	Collection<String> cmp=new ArrayList<String>();
	cmp.add(cmp20);
	cmp.add(cmp19);
	cmp.add(cmp18);
	cmp.add(cmp17);
	cmp.add(cmp16);
	cmp.add(cmp15);
	cmp.add(cmp14);
	cmp.add(cmp13);
	cmp.add(cmp12);
	cmp.add(cmp11);
	cmp.add(cmp10);
	cmp.add(cmp9);
	cmp.add(cmp8);
	cmp.add(cmp7);
	cmp.add(cmp6);
	cmp.add(cmp5);
	cmp.add(cmp4);
	cmp.add(cmp3);
	
	
	cmp.add(cmp2);
	cmp.add(cmp1);

	System.out.println(cmp+" \n"+cmp.size());
	System.out.println();
	for(String comp:cmp)
	{
		System.out.println(comp);
	}
	System.out.println();
	System.out.println("Iterator method is used");
	Iterator<String> company=cmp.iterator();
	while(company.hasNext())
	{
		System.out.println(company.next());
	}

	}

}
