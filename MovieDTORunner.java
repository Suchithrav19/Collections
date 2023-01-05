package com.xworkz.collection;
import java.util.*;
import java.time.LocalDate;

public class MovieDTORunner {

	public static void main(String[] args) {
	
		MovieDTO movie=new MovieDTO("KGF",100,"Kannada",1000,LocalDate.of(2022,04,01));
		MovieDTO movie1=new MovieDTO("Kanthara",15,"Kannada",100,LocalDate.of(2022,05,26));
		MovieDTO movie2=new MovieDTO("RRR",100,"Telugu",300,LocalDate.of(2022,10,18));
		MovieDTO movie3=new MovieDTO("Yajamana",50,"Kannada",1100,LocalDate.of(2022,05,01));
		MovieDTO movie4=new MovieDTO("Veda",70,"Kannada",1022,LocalDate.of(2022,12,24));
		
       List<MovieDTO> movies=new ArrayList();
       movies.add(movie4);
       movies.add(movie3);
       movies.add(movie2);
       movies.add(movie1);
       movies.add(movie);
       
       movies.stream().sorted().forEach((a)->{System.out.println(a);});
       System.out.println("++++++++++++++++++++");
       
       Comparator<MovieDTO> compare=(a,b)->Double.compare(a.getBudget(),b.getBudget());
       
       movies.stream().sorted(compare).forEach(a->System.out.println(a));
       System.out.println("++++++++++++++++++++");
       
       
       movies.stream()
       .sorted((a1,a2)->Double.compare(a1.getBudget(),a2.getBudget()))
       .forEach(a->System.out.println(a));
       System.out.println();
       System.out.println("+++++acseinding to decending++++++");
       
       movies.stream()
       .sorted((a1,a2)->Double.compare(a2.getBudget(),a1.getBudget()))
       .forEach(a->System.out.println(a));
       
       System.out.println();
       System.out.println("+++++++++++++++++++++"); 
       movies.stream()
       .sorted(compare).forEach(a->System.out.println(a));
       
	}

}
