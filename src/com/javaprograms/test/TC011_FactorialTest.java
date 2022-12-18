package com.javaprograms.test;

import java.util.Scanner;

public class TC011_FactorialTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number....");
		int num = scanner.nextInt();
		int orgnum = num;
		System.out.println("Entered The Number :" + orgnum);
		int fact = 1;

		for (int i = 1; i <= orgnum; i++) {

			fact = fact * i;
		}

		System.out.println("Factorial Number of " + orgnum + ": " + fact);

	}

}
