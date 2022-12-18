package com.javaprograms.test;

public class TC013_EvenandOddArrayTest {

	public static void main(String[] args) {

		int[] a = { 10, 7, 5, 21, 50 };

		int evennum = 0;
		int oddnum = 0;

		for (int data : a) {

			if (data % 2 == 0) {

				System.out.println("Even Number From an Array: "+data);
				evennum++;
				
			}else {
				
				System.out.println("oddd Number From an Array: "+data);
				oddnum++;
			}
				
		}
		System.out.println("Even Numbers: "+evennum+" Odd Numbers: "+oddnum);
	}

}
