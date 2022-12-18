package com.javaprograms.test;

import java.util.Scanner;

public class TC003_ReverseStringTest {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String value");
		String stringname = scanner.next();
		String orgvalue = stringname;
		System.out.println("Before Reversing Of String Value.." + orgvalue);

		int lng = orgvalue.length();
		String revstrng = "";

		for (int i = lng - 1; i >= 0; i--) {

			revstrng = revstrng + orgvalue.charAt(i);
		}

		System.out.println("After Reversing Of String Value.." + revstrng);
	}
	
	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String value");
		String stringdata = scanner.next();
		String orgvalue = stringdata;
		System.out.println("Before Reversing Of String Value.." + orgvalue);
		
		StringBuffer sb = new StringBuffer(orgvalue);
		StringBuffer revstrng = sb.reverse();
		System.out.println("Before Reversing Of String Value.." + revstrng);
		
	}
	*/
}
