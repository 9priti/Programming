package com.practice.programming.java;

import java.util.Scanner;

public class ReverseStringApproach1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Please enter the string to reverse-->");
	String tempString = sc.nextLine();
	StringBuilder strBuilder = new StringBuilder ();
	strBuilder.append(tempString);
	strBuilder = strBuilder.reverse();
	for (int i =0 ; i< strBuilder.length();i++)
	{
		System.out.print(strBuilder.charAt(i));
	}

	}

}
