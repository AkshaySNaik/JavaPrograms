package com.javaprograms.test;

import java.util.HashSet;

public class TC017_DuplicateArrayTest {

	public static void main(String[] args) {

		String[] a = { "Ravi", "Praveen", "Suresh", "Dheraj", "Suresh" };

		HashSet<String> hashset = new HashSet();
		boolean flag = false;

		for (String value : a) {

			if (hashset.add(value) == false) {

				System.out.println("The Given String Array Has A Duplicate Value :"+value);
				flag = true;
			}
		}
        if(flag == false) {
        	
        	System.out.println("The are No Duplicate Value");
        }
	}

}
