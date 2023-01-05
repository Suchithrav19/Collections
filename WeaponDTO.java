package com.xworkz.collection;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO> {
	private String name;
	private String madeBy;
	private LocalDate madeOn;
	private int price;
	private WeaponType type;
	public WeaponDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WeaponDTO(String name, String madeBy, LocalDate madeOn, int price, WeaponType type) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.madeOn = madeOn;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", madeOn=" + madeOn + ", price=" + price + ", type="
				+ type + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMadeBy() {
		return madeBy;
	}
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	public LocalDate getMadeOn() {
		return madeOn;
	}
	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public WeaponType getType() {
		return type;
	}
	public void setType(WeaponType type) {
		this.type = type;
	}
	@Override
	public int compareTo(WeaponDTO o) {
		return this.name.compareTo(o.name);
	}
	@Override
	public int hashCode()
	{
		return 30;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(obj!=null)
		{
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO weapon=(WeaponDTO)obj;
				if(weapon.name.equals(this.name))
				{
					return true;
				}
			}
		}
		return false;
	}
}


