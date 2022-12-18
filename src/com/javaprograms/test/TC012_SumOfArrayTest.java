package com.javaprograms.test;

public class TC012_SumOfArrayTest {

	public static void main(String[] args) {

		int[] arr = { 14, 23, 34, 46, 57 };

		int sum = 0;

		for (int value : arr) {

			sum = sum + value;
		}

		System.out.println("Sum Of Given Arrays: " + sum);

	}

}
