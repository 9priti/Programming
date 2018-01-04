package com.practice.programming.java;

import java.util.Scanner;

public class FactorialWithoutRecursion {

	public static void main(String[] args) {
	
		System.out.println("please enter the number whose factorial is to be found :");
		Scanner sc = new Scanner (System.in);
		int count = sc.nextInt();
		System.out.println (factorial (count));
				
		

	}

	private static int  factorial(int count) {
		int result = 1;
		for (int i=1 ; i <=count ;i++)
		{
			result = result*i;
		}
		return result;
	}

}
