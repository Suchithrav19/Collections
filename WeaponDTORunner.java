package com.xworkz.collection;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;


public class WeaponDTORunner {
	

	public static void main(String args[])
	{
		WeaponDTO weapon=new WeaponDTO("PistolAuto","INDIA",LocalDate.of(2022,03,01),2000,WeaponType.Pistol);
		WeaponDTO weapon1=new WeaponDTO("Rifle","CHINA",LocalDate.of(2021,05,02),3000,WeaponType.Shotgun);
		WeaponDTO weapon2=new WeaponDTO("Shotgun","BELGIUM",LocalDate.of(2020,06,01),4000,WeaponType.Rifle);
		WeaponDTO weapon3=new WeaponDTO("Sniper rifle","BANGLADESH",LocalDate.of(2019,11,8),2500,WeaponType.Swords);
		WeaponDTO weapon4=new WeaponDTO("Submachine gun","GERMANY",LocalDate.of(2018,04,01),2000,WeaponType.BowAndArrow);
		WeaponDTO weapon5=new WeaponDTO("Grenade","CANADA",LocalDate.of(2017,02,11),4000,WeaponType.Artillery);
		WeaponDTO weapon6=new WeaponDTO("Handgun","FRANCE",LocalDate.of(2016,04,12),7000,WeaponType.Spear);
		WeaponDTO weapon7=new WeaponDTO("Artillery","CHAD",LocalDate.of(2015,05,10),6000,WeaponType.MachineGun);
		WeaponDTO weapon8=new WeaponDTO("Swords","BHUTAN",LocalDate.of(2014,06,25),3000,WeaponType.Dagger);
		WeaponDTO weapon9=new WeaponDTO("Light machine gun","CAMEROON",LocalDate.of(2013,01,29),1000,WeaponType.Firearm);
		WeaponDTO weapon10=new WeaponDTO("Spear","BRAZIL",LocalDate.of(2012,07,16),9000,WeaponType.Handgun);
		WeaponDTO weapon11=new WeaponDTO("Firearm","AMBANIA",LocalDate.of(2011,06,18),9500,WeaponType.Missile);
		WeaponDTO weapon12=new WeaponDTO("Katana","INDIA",LocalDate.of(2010,11,29),2200,WeaponType.Pistol);
		WeaponDTO weapon13=new WeaponDTO("Crossbow","CHINA",LocalDate.of(2009,12,28),3200,WeaponType.Club);
		WeaponDTO weapon14=new WeaponDTO("M4 carbine","CYPRUS",LocalDate.of(2022,10,26),4200,WeaponType.lance);
		WeaponDTO weapon15=new WeaponDTO("Dagger","CANADA",LocalDate.of(2020,07,24),1200,WeaponType.Club);
		WeaponDTO weapon16=new WeaponDTO("AK-47","INDIA",LocalDate.of(2002,06,23),8000,WeaponType.Assaultrifle);
		WeaponDTO weapon17=new WeaponDTO("Rocket launcher","INDIA",LocalDate.of(2022,05,21),1000,WeaponType.Pistol);
		WeaponDTO weapon18=new WeaponDTO("Cannon","BELARUS",LocalDate.of(2011,03,17),1500,WeaponType.Axe);
		WeaponDTO weapon19=new WeaponDTO("Musket","INDIA",LocalDate.of(2001,02,19),7500,WeaponType.Katana);
		WeaponDTO weapon20=new WeaponDTO("Axe","ASTRALIA",LocalDate.of(2004,04,19),2000,WeaponType.Pistol);
	
	System.out.println(weapon20);
	
	Collection<WeaponDTO> dto=new ArrayList<WeaponDTO>();
	dto.add(weapon20);
	dto.add(weapon19);
	dto.add(weapon18);
	dto.add(weapon17);
	dto.add(weapon16);
	dto.add(weapon15);
	dto.add(weapon14);
	dto.add(weapon13);
	dto.add(weapon12);
	dto.add(weapon11);
	dto.add(weapon10);
	dto.add(weapon9);
	dto.add(weapon8);
	dto.add(weapon7);
	dto.add(weapon6);
	dto.add(weapon5);
	dto.add(weapon4);
	dto.add(weapon3);
	dto.add(weapon2);
	dto.add(weapon1);
	
	
	for(WeaponDTO weapons:dto)
	{
		System.out.println(weapons);
	}
	
	System.out.println("****************************************");
	  dto.stream()
	  .sorted()
	  .forEach((a)->{System.out.println(a);});
	  
      System.out.println("\n****************************************");
      System.out.println("\nFind and print all weapons by price greater than 4000");
      System.out.println("\n****************************************");
      
    
    dto.stream()
  	  .filter((a)->{return a.getPrice()>4000;})
      .collect(Collectors.toList())
      .forEach(a->System.out.println(a));
    
    System.out.println("\n****************************************");
    System.out.println("\nFind and print all weapons madeBy and madeOn");
    System.out.println("\n***********************************************");
    
	dto.stream()
	.map((a)->{return a.getName().toLowerCase();})
	.collect(Collectors.toList())
	.forEach(a->System.out.println(a));
    
	System.out.println("\n***********************************************");
	System.out.println("\nFind and print all weapons MadeBy and MadeOn");
	System.out.println("\n***********************************************");
	
    dto.stream()
	.forEach(a->System.out.println("MadeBy : "+a.getMadeBy()+"..... MadeOn : "+a.getMadeOn()));
    
    System.out.println("\n**************************************************************");
    System.out.println("\nFind and print all weapons sort by name sorted in desc order");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted((a,b)->a.getName().compareTo(b.getName()))
	.forEach(a->System.out.println(a));
    
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by MadeBy");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted((a,b)->a.getMadeBy().compareTo(b.getMadeBy()))
	.forEach(a->System.out.println(a));
    
    
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by MadeOn");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted((a,b)->a.getMadeOn().compareTo(b.getMadeOn()))
	.forEach(a->System.out.println(a));
    
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by price");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted((a,b)->Integer.compare(a.getPrice(), b.getPrice()))
	.forEach(a->System.out.println(a));
    
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by price desc");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted((a,b)->Integer.compare(b.getPrice(), a.getPrice()))
	.forEach(a->System.out.println(a));
    
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by name and madeOn asc order");
    System.out.println("\n***************************************************************");
    
    
    dto.stream()
	.sorted((a,b)->a.getMadeOn().compareTo(b.getMadeOn()))
	.forEach(a->System.out.println(a));
    
    
    Comparator<WeaponDTO> compares=(a,b)->a.getMadeOn().compareTo(b.getMadeOn());
	Comparator<WeaponDTO> compare11=(a,b)->a.getName().compareTo(b.getName());
	
	
    System.out.println("\n**************************************************************");
    System.out.println("\nPrint all weapons sort by type and madeBy, name in desc order");
    System.out.println("\n***************************************************************");
    
    dto.stream()
	.sorted(compares.thenComparing(compare11))
	.forEach(a->System.out.println(a));
    
    System.out.println("\n**************************************************************");
    
    dto.stream()
	.sorted((a,b)->b.getName().compareTo(a.getName()))
	.forEach(a->System.out.println(a));
	
    
    
    
    
	
    
	}
	
	
	
	
	
	 
	

	
	 

}

