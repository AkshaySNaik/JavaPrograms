package com.javaprograms.test;

public class TC019_VowelsInStringTest {

	public static void main(String[] args) {

		String name = "ramesh";
		int size = name.length();
		int count = 0;

		for (int i = 0; i <= size - 1; i++) {

			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				count++;
			}
		}
		System.out.println("Number Of Viowels Present In String :" + count);
	}

}
