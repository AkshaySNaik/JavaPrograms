package com.javaprograms.test;

public class TC018_LinerSearchArrayTest {

	public static void main(String[] args) {

		String[] a = { "Ravi", "Praveen", "Suresh", "Dheraj", "Suresh" };

		String search = "Dheraj";
		boolean flag = false;

		for (String value : a) {

			if (value == search) {

				System.out.println("Found The Array Value: " + value);
				flag = true;
				break;
			}
		}
		if (flag == false) {

			System.out.println("Not Found The Array Value");
		}
	}
}
