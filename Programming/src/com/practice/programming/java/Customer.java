package com.practice.programming.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerAddress;
	private String order;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public Customer(int customerId, String customerName, String customerAddress, String order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.order = order;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}
	@Override
	public String toString ()
	{
		return ""+customerId+"  "+customerName+"  "+customerAddress+"  "+order+" / ";
	}

	public static void main(String[] args) {
		Customer c1 = new Customer (1,"Priti","Bangalore","Flipkart");
		Customer c2 = new Customer (2,"Priya","Mumbai","Amazon");
		Customer c3 = new Customer (3,"Abhishek","Pune","Ebay");
		Customer c4 = new Customer (1,"Priti","Bangalore","Flipkart");
		
		List<Customer> tempList = new ArrayList ();
		tempList.add(c1);
		tempList.add(c2);
		tempList.add(c3);
		tempList.add(c4);
		System.out.println("List just after adding dupliate elements -->"+tempList);
		Set tempSet = new LinkedHashSet ();
		tempSet.addAll(tempList);
		System.out.println("Set elements -->"+tempSet);
		List finalList = new ArrayList ();
		finalList.addAll(tempSet);
		System.out.println("List after usng LinkedHashSet-->"+finalList);
	}

}
