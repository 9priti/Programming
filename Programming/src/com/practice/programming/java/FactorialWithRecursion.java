package com.practice.programming.java;

import java.util.Scanner;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		System.out.println ("Enter the number whose factorial is to be calculated :");
		Scanner sc = new Scanner (System.in);
		int count = sc.nextInt();
		
		System.out.println("Factorial of "+ count +" is "+ factorial (count));
	}

	private static int factorial(int count) {
		
		if (count == 0 || count == 1)
		{
			return 1;
		}
			return count*factorial(count-1) ;
	}
}
