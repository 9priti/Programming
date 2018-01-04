package com.practice.programming.java;

import java.util.Scanner;

public class FibonacciWithRecursion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter upto what number you want to print the fibonacci series-->");
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			System.out.print(fibonacci(i) + "  ");
		}
	}

	private static int fibonacci(int i) {
		if (i == 1 || i == 2) {
			return 1;
		}
		return fibonacci (i-1) +fibonacci (i-2);
	}

}
