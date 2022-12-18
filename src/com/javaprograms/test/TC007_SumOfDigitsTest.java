package com.javaprograms.test;

import java.util.Scanner;

public class TC007_SumOfDigitsTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number...");
		int numbers = scanner.nextInt();
		int actualnumbers = numbers;
		System.out.println("Before Reversing Of Number Value...." + actualnumbers);
		int sum = 0;

		while (actualnumbers > 0) {

			sum = sum + actualnumbers % 10;
			actualnumbers = actualnumbers / 10;
		}

		System.out.println("After Reversing The Sum Number Value...." + sum);

	}
}
