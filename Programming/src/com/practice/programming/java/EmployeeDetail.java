package com.practice.programming.java;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetail {
	
	private  String empName ;
	private  String empGender ;
	private  int empAge ;
	private  int empSeqNumber;
	static ArrayList <EmployeeDetail>tempList = new ArrayList <EmployeeDetail> ();
	
	 public EmployeeDetail (String name , String gender , int age ,int seqNumber )
	 {
		 empName = name;
		 empGender = gender ;
		 empAge = age ;
		 empSeqNumber = seqNumber ;
	 }
	 
	public  String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public  String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	public  int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public  int getEmpSeqNumber() {
		return empSeqNumber;
	}

	public  void setEmpSeqNumber(int empSeqNumber) {
		empSeqNumber = empSeqNumber;
	}
	 
	
	@ Override
	public	String toString ()
	
	{
		//System.out.println (Employee.getEmpName()+Employee.getEmpGender()+Employee.getEmpAge()+Employee.getEmpSeqNumber());
		return getEmpName()+"   "+getEmpGender()+"     "+getEmpAge()+"    "+getEmpSeqNumber();
	}
	
	public static void main (String args [])
	{
		EmployeeDetail temp;
		for (int i=1 ; i<4 ;i++)
		{
			System.out.println ("Please enter Employee Name-->");
			Scanner sc = new Scanner (System.in);
			String empName = sc.nextLine();
			
			System.out.println("Please enter Employee Gender -->");
			Scanner sc1 = new Scanner (System.in);
			String empGender = sc.nextLine();
			
			System.out.println("Please enter Employee Age -->");
			Scanner sc3 = new Scanner (System.in);
			int empAge = sc3.nextInt();
			
			EmployeeDetail emp = new EmployeeDetail (empName,empGender,empAge,i);
			
			tempList.add(emp);
		}
		for (int i=0;i<3;i++)
		{
			System.out.println(tempList.get(i).toString());
		}
	
	 for(int i=0;i<tempList.size();i++){

	        for(int j=i+1;j<tempList.size();j++){

	     if(( tempList.get(i).getEmpName()).compareTo(tempList.get(j).getEmpName())>0){

	            temp=tempList.get(i);
	            tempList.set(i, tempList.get(j));
	            tempList.set(j,temp );   

	     }
	        }
	    }
	 System.out.println(tempList);
}
}