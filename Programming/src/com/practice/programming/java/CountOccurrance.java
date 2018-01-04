package com.practice.programming.java;

public class CountOccurrance {
	
	public static void main (String args [])
	{
		
		String testString = "This is a beautiful morning here in India today ";
		//int count = 0;
		countNumber (testString);
		System.out.println("The number of occurrance of 'a' in testString "+testString + " is "+countNumber (testString));
		
	}
	
	public static int countNumber (String temp)
	{
		char charCount =0;
		char [] tempArray = temp.toCharArray();
				for (char ch : tempArray)
				{
					if (ch == 'e')
					{
						charCount++;
					}
				}
				return charCount;
	}

}
