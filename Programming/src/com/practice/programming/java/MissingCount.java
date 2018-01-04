package com.practice.programming.java;

public class MissingCount {

	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10,12};
		int totalCount = 12 ;
		System.out.println(getMissingNumber (numbers ,totalCount));

	}

		private static int getMissingNumber(int[] numbers, int totalCount) 
		{ 
			int expectedSum = (totalCount * (totalCount+1))/2;
			int actualSum = 0; for (int i : numbers)
			{ 
				actualSum += i; 
				} 
			return expectedSum - actualSum; 
			} 
	}


