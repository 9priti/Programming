package com.practice.programming.java;

public class ReverseString {

	public static void main(String[] args) {
	
		String testString = "abcdefghijklmnopqrstuvwxyz";
		reversedString (testString);
		System.out.println("Reversed sString is :"+reversedString (testString));
		
	}

	private static String reversedString(String testString) {
		char [] tempArray = testString.toCharArray();
		StringBuilder sb = new StringBuilder ();
		;
		for (int i = tempArray.length -1; i>0 ;i--)
		{
			sb.append(tempArray [i]);
		}
		return sb.toString(); 
	}

}
