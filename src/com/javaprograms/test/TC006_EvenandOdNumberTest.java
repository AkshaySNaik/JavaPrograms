package com.javaprograms.test;

import java.util.Scanner;

public class TC006_EvenandOdNumberTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number....");
		int num = sc.nextInt();
		int actnum = num;
		System.out.println("Entered The Integer Values :" + actnum);

		int rem = 0;
		int evennum = 0;
		int oddnum = 0;

		while (actnum > 0) {

			rem = actnum % 10;

			if (rem % 2 == 0) {

				evennum++;

			} else {

				oddnum++;
			}

			actnum = actnum / 10;
		}
		System.out.println("Even Number Cont :" + evennum);
		System.out.println("Odd Number Cont :" + oddnum);
	}

}
