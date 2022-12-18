package com.javaprograms.test;

import java.util.Scanner;

public class TC020_CountWordsString {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String value");
		String stringname = scanner.next();
		String orgvalue = stringname;
		System.out.println("Before Reversing Of String Value.. " + orgvalue);

		int size = orgvalue.length();
		int count = 0;

		for (int i = 0; i <= size - 1; i++) {

			count++;
		}

		System.out.println("The Size Of The Given String :" + count);

	}

}
