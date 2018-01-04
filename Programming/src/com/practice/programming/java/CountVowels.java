package com.practice.programming.java;

public class CountVowels {
	//Comment
	public  static void main (String args [])
	{
		String testString = "qwertyuioplkjhgfdsazxcvbnmaeiouaeiouaeiou";
		
		countVowels (testString);
		System.out.println("Vowel count in testString "+testString+" is "+countVowels (testString));
	}
	
	public static int countVowels (String tempString)
	{
		 int vowelCount =0 ;
		char [] charArray = tempString.toCharArray();
		
		for (char ch : charArray)
		{
			if (ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowelCount ++;
			}
		}
		return vowelCount ;
	}
}
