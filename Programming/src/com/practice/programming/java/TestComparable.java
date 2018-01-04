package com.practice.programming.java;

class Vehicle implements Comparable <Vehicle>
{
	private String brandName;
	private int price;
	
		public Vehicle(String brandName, int price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}

		public String getBrandName() {
		return brandName;
	}


	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public int compareTo(Vehicle tempVehicle) {
		if (this.price > tempVehicle.getPrice())
		{
			return 1;
		}
		else if (this.getPrice() < tempVehicle.getPrice())
		{
			return -1;
		}
		else return 0;
	}

}

public class TestComparable {

	public static void main(String[] args) {
		
		Vehicle v1 = new Vehicle ("Swift Dezire" ,650000);
		Vehicle v2 = new Vehicle ("Hundai Verna", 800000);
		
		if (v1.compareTo(v2) >0)
		{
			System.out.println(v1.getBrandName() +"is costlier than "+v2.getBrandName());
		}
		System.out.println(v2.getBrandName() +"is costlier than "+v1.getBrandName());

	}

}
