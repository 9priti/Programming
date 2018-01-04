package com.practice.programming.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentDetail {
	
	private String firstName;
	private String lName;
	private int rollNum;
	
	public StudentDetail (String fName,String lName,int rollNumber){
		firstName= fName;
		this.lName= lName;
		rollNum=rollNumber;
	}
	
	public String toString()
	{
		return firstName+"   "+lName+"  ";
	}
	
	public static void main (String args [])
	{
		HashMap <Integer,StudentDetail> tempMap = new HashMap <Integer,StudentDetail> ();
		ArrayList tempList = new ArrayList ();
		
		for (int i=0;i<3;i++)
		{
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Please enter Student First Name-->");
			String tempFirstName = sc1.next();
			
			Scanner sc2 = new Scanner (System.in);
			System.out.println ("Please enter Student Last Name -->");
			String tempLastName = sc2.next();
			
			Scanner sc3 = new Scanner (System.in);
			System.out.println("Please enter Stuent rollNumber -->");
			int tempRollNumber = sc3.nextInt();
			
			StudentDetail std = new StudentDetail (tempFirstName, tempLastName,tempRollNumber);
			tempMap.put(tempRollNumber, std);
		}
		System.out.println("Student Detail -->"+tempMap);
	}

}
