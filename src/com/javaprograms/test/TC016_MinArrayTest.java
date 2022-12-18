package com.javaprograms.test;

public class TC016_MinArrayTest {

	public static void main(String[] args) {

		int[] a = { 22, 65, 89, 94, 47 };

		a[2] = 89;

		for (int value : a) {

			if (value < a[2]) {

				a[2] = value;
			}
		}

		System.out.println("Minium Number In An Array: " + a[2]);
	}

}
