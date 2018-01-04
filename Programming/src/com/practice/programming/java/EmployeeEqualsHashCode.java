package com.practice.programming.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeEqualsHashCode {
	
	private int empId;
	private String empFirstName ;
	private String empLastName;
	
	public EmployeeEqualsHashCode (int eId,String eFirstName, String eLastName)
	{
		empId = eId;
		empFirstName = eFirstName;
		empLastName = eLastName;
	}
			
	@Override 
	
	public int hashCode ()
	{
		final int prime =13;
		int result = 1;
		result = prime*result +(empFirstName != null ? 0 : empFirstName.hashCode());
		result = prime * result + empId;
		result = prime *result + (empLastName!= null ? 0 : empLastName.hashCode());
		return result;
		
	}
	
	public boolean equals (Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (obj == null  ||(obj.getClass() != this.getClass()))
		{
			return false;
		}
		EmployeeEqualsHashCode emp = (EmployeeEqualsHashCode) obj;
		return (emp.empId == empId && (emp.empFirstName != null && emp.empFirstName.equalsIgnoreCase(empFirstName))&& emp.empLastName != null && emp.empLastName.equalsIgnoreCase(empLastName));
	}
	
	public static void main(String[] args) {
		List list = new ArrayList ();
		for (int i= 0 ; i<=1 ;i++){
		System.out.println ("Please enter EmployeeID-->");
		Scanner sc1 = new Scanner (System.in);
		int id = sc1.nextInt();
		System.out.println("Please enter Employee First Name -->");
		Scanner sc2= new Scanner (System.in);
		String fName = sc2.nextLine();
		System.out.println("Please enter Employee Last Name -->");
		Scanner sc3 = new Scanner (System.in);
		String lName = sc3.nextLine();
		EmployeeEqualsHashCode emp = new EmployeeEqualsHashCode(id,fName,lName);
		list.add(emp);
		System.out.println("HashCode value -->"+list.get(i).hashCode());
		}
		System.out.println("Equals test -->"+list.get(0).equals(list.get(1)));


	}

}
