package com.javaprograms.test;

import java.util.Scanner;

public class TC004_PalindromeNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number....");
		int num = sc.nextInt();
		int actualnum = num;
		int rev = 0;

		while (actualnum > 0) {

			rev = rev * 10 + actualnum % 10;
			actualnum = actualnum / 10;

		}
		
		if(num==rev) {
			
			System.out.println("Entered Number IS A Palindrome Number :"+rev);
		}else {
			
			System.out.println("Entered Number IS Not A Palindrome Number :"+rev);
		}

	}

}
