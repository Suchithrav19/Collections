package com.xworkz.collection;

import java.io.Serializable;
import java.time.LocalDate;
public class MovieDTO implements Serializable,Comparable<MovieDTO> {
	private String name;
	private double budget;
	private String language;
	private double profit;
	private LocalDate date;
	public MovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieDTO(String name, double budget, String language, double profit, LocalDate date) {
		super();
		this.name = name;
		this.budget = budget;
		this.language = language;
		this.profit = profit;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", budget=" + budget + ", language=" + language + ", profit=" + profit
				+ ", date=" + date + "]";
	}
	@Override
	public int hashCode()
	{
		return 30;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
		{
			if(obj instanceof MovieDTO)
			{
				MovieDTO movie=(MovieDTO)obj;
				if(movie.name.equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}
	@Override
	public int compareTo(MovieDTO o)
	{
		return this.name.compareTo(o.name);
	}
	
	

}
 