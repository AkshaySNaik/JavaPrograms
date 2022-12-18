package com.javaprograms.test;

import java.util.Scanner;

public class TC008_LargestNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int a1 = sc.nextInt();
		int b2 = sc.nextInt();
		int c3 = sc.nextInt();
		System.out.println("Values are.... a:" + a1 + " b:" + b2 + " c:" + c3);
		if (a1 > b2 && a1 > c3) {

			System.out.println("A Is The Largest Value :" + a1);

		} else if (b2 > a1 && b2 > c3) {

			System.out.println("B Is The Largest Value :" + b2);

		} else if (c3 > a1 && c3 > b2) {

			System.out.println("C Is The Largest Value :" + c3);

		}

	}
}
