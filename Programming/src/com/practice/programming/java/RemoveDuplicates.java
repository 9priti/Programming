package com.practice.programming.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
        }



	}

	  public static Object[] removeDuplicates(int[] numbersWithDuplicates) {

	        // Sorting array to bring duplicates together      
	        Arrays.sort(numbersWithDuplicates);    
	        
	        Set tempSet = new HashSet ();
	        
	        for (int i : numbersWithDuplicates)
	        {
	        	tempSet.add(i);
	        }
	        return tempSet.toArray();

	    }


	
}
