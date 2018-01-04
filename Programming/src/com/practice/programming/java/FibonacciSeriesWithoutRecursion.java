package com.practice.programming.java;

import java.util.Scanner;

public class FibonacciSeriesWithoutRecursion {

	public static void main(String[] args) {


		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter the the number upto which the Fibonacci series to print-->");
		int count = sc.nextInt();
		
		System.out.println("The Fibonacci series upto "+count+" numbers is as follows :");
		for (int i=1;i <=count;i++)
		{
			System.out.println(fibonacciCal (i) + "  ");
		}

	}
	
	public static int fibonacciCal (int number)
	{
		if (number==1 || number == 2)
		{
			return 1;
		}
		
			int fib1 = 1 ; int fib2 =1 ; int fibonacci =1;
			for (int i=3;i<=number;i++)
			{
				fibonacci = fib1+fib2;
				fib1 =fib2;
				fib2= fibonacci;
			}
			return fibonacci;
	}

}
