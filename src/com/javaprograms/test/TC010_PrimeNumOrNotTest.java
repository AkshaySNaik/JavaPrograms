package com.javaprograms.test;

import java.util.Scanner;

public class TC010_PrimeNumOrNotTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int num = sc.nextInt();
		int actualnum = num;
		System.out.println("Before The Reversing Of Number Value...." + actualnum);

		int count = 0;

		for (int i = 1; i <= actualnum; i++) {

			if (actualnum % i == 0) {
				count++;
			}
		}

		if (count == 2) {

			System.out.println("Given Number Is A Prime Number");

		} else {

			System.out.println("Given Number Is Not A Prime Number");
		}

	}

}
