package com.practice.programming.java;

public class RemoveCharacter {

	public static void main(String[] args) {
		
		String testString = "QWuwuUUUUUertyu";
		String testString1 = testString.toLowerCase();
		String character = "u" ;
		System.out.println(testString1);
		removechar ( testString1 , character );

	}

	private static void removechar(String testString1, String character) {
		/*
		char [] charArray = testString.toCharArray();
		for (char c : charArray )
		{
			
		}*/
		String tempString = testString1.replaceAll(character, "");
		System.out.println("In removechar"+tempString);
	}	

}
