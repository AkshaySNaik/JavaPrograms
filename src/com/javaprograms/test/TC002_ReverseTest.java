package com.javaprograms.test;

import java.util.Scanner;

public class TC002_ReverseTest {

	/*
	  public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in); 
	  System.out.println("Enter Number...");
	  int num = sc.nextInt(); int actualnum = num;
	  System.out.println("Before The Reversing Of Number Value...." + actualnum);
	  int revnum = 0;
	  
	  while (actualnum > 0) {
	  
	  revnum = revnum * 10 + actualnum % 10; actualnum = actualnum / 10; }
	  
	  System.out.println("After The Reversing Of Number Value...." + revnum); }
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number...");
		int numbers = scanner.nextInt();
		int actualnumbers = numbers;
		System.out.println("Before The Reversing Of Number Value...." + actualnumbers);

		StringBuffer sb = new StringBuffer(String.valueOf(actualnumbers));
		StringBuffer revnumbers = sb.reverse();

		System.out.println("After The Reversing Of Number Value...." + revnumbers);

	}

}
