package com.practice.programming.java;

import java.util.Scanner;

public class ReverseStringApproach2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter the input String to reverse -->");
			Scanner sc = new Scanner (System.in);
			String tempString = sc.nextLine();
			char [] tempArray = tempString.toCharArray();
			int left , right = 0;
			right = tempArray.length -1;
			
			for ( left =0  ; left < right ; left ++ , right --)
			{
				char temp = tempArray [left];
				tempArray [left] = tempArray [right];
				tempArray [right] = temp;
			}
			
			for (char c : tempArray)
		System.out.print(c);

	}

}
