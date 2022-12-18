package com.javaprograms.test;

public class TC015_MaxArrayTest {

	public static void main(String[] args) {

		int[] a = { 45, 78, 53, 64, 57 };

		a[0] = 45;

		for (int value : a) {

			if (value > a[0]) {

				a[0] = value;
			}
		}

		System.out.println("Maximum Number In An Array: " + a[0]);
	}
}
