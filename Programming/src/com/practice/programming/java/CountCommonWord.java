package com.practice.programming.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountCommonWord {
	
	public static void main (String args [])
	{
		int count =1;
		Scanner sc = new Scanner (System.in) ;
		String inputString= sc.nextLine();
		
		String [] inputStringArray = inputString.split(" ");
		
		String []  wordsArray = inputString.split(" ");
		List<String> wordsList =  Arrays.asList(wordsArray);
		Set<String>  wordsSet  = new LinkedHashSet<String>(wordsList);
		System.out.println(wordsSet.toString().replace(',', ' '));

		String[] noDuplicates = new String[wordsSet.size()];
		wordsSet.toArray(noDuplicates);
		
		List <String> tempList = new ArrayList <String> ();
		//System.out.println("Words in the sentence are as follows : ");
		for (String str : inputStringArray)
		{
			//str.toLowerCase();
			//System.out.println(str.toLowerCase());
			tempList.add(str.toLowerCase());
		}
		
		
		Map <String , Integer > tempMap = new HashMap <String,Integer> ();
		 for (String str : tempList)
		 {
			 if (!tempMap.containsKey(str))
			 {
				 tempMap.put(str, count);
			 }
			 else 
			 {
				 tempMap.put(str, tempMap.get(str)+1);
			 }
		 }
		 System.out.println("The list of all the words in the input String is as follows:");
		// System.out.println(tempMap.keySet());
		 System.out.println(tempMap.entrySet());
		
	}
	
}