package com.javaprograms.test;

import java.util.Scanner;

public class TC005_CountNumberInDigitTest {

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner scanner = new Scanner(System.in);
	 * System.out.println("Enter The String Value"); String stingvalue =
	 * scanner.next(); String orgvalue = "";
	 * System.out.println("Entered String Value..." + stingvalue); int count = 0;
	 * 
	 * int size = stingvalue.length();
	 * 
	 * for (int i = 0; i <= size - 1; i++) {
	 * 
	 * orgvalue = orgvalue + stingvalue.charAt(i); count++; }
	 * System.out.println("Number Of Digits Present In String "+ orgvalue +" are :"+ count);
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Integer Value");
		int stingvalue = scanner.nextInt();
		int orgvalue = stingvalue;
		System.out.println("Entered String Value..." + orgvalue);
		int count = 0;

		while (orgvalue > 0) {

			orgvalue = orgvalue / 10;
			count++;
		}

		System.out.println("Number Of Digits Present In Integer are :" + count);

	}

}
