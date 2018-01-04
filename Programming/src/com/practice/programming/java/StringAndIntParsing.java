package com.practice.programming.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* Program to get a string and an integer array out of an input String !!
 * 
 */
public class StringAndIntParsing {

	public StringAndIntParsing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Please enter a String comprising of int and characters :");
		Scanner sc = new Scanner (System.in);
		String inputString = sc.nextLine();
		List <Integer> intArray = new ArrayList <Integer> ();
		List  charArray = new ArrayList  ();
		
		String[] tempArray = inputString.split("");
			for ( String ch : tempArray )
			{
				try 
				{
					int intInput = Integer.parseInt(ch);
					intArray.add(intInput);
				}
				catch (NumberFormatException e)
				{
					
					charArray.add(ch);
					
				}
				
			}
			System.out.println(intArray.toString());
			System.out.println(charArray.toString());
	}

}
