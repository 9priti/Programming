package com.practice.programming.java;

import java.util.Arrays;

public class AnagramCheck {
	
	public static void main (String args [])
	{
		String originalString = "test";
		String testString = "rriti";
		
		checkAnagram (originalString, testString);
		System.out.println(checkAnagram (originalString, testString));
	}

	public static boolean checkAnagram (String original , String test)
	{
		char [] originalArray = original.toCharArray();
		char [] testArray = test.toCharArray();
		Arrays.sort(originalArray);
		Arrays.sort(testArray);
		
		return Arrays.equals(originalArray, testArray);
	}
	
}
