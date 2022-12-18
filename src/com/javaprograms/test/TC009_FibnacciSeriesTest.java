package com.javaprograms.test;

public class TC009_FibnacciSeriesTest {

	public static void main(String[] args) {

		int f1 = 0, f2 = 1, sum = 0;

		System.out.print("Fibbnacci Series :" + f1 + " " + f2);

		for (int i = 2; i <= 15; i++) {

			sum = f1 + f2;
			System.out.print(" " + sum);
			f1 = f2;
			f2 = sum;
		}

	}

}
