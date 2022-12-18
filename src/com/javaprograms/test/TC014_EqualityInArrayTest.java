package com.javaprograms.test;

import java.util.Arrays;

public class TC014_EqualityInArrayTest {

	public static void main(String[] args) {

		int[] a1 = { 10, 20, 30, 40, 50 };
		int[] b2 = { 10, 20, 31, 40, 50 };

		boolean result = Arrays.equals(a1, b2);

		if (result == true) {

			System.out.println("Given Arrays Are Equal");

		} else {

			System.out.println("Given Arrays Are Not Equal");
		}

	}

}
