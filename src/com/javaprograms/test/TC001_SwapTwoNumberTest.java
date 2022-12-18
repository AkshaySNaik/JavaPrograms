package com.javaprograms.test;

public class TC001_SwapTwoNumberTest {

	 /*
     public static void main(String[] args) {
	  
	  int a = 10, b = 20, c;
	  
	  System.out.println("Before Swaping Numbers..."+" a:" + a + " b:" + b);
	  
	  c = a; a = b; b = c;
	  
	  System.out.println("After Swaping Numbers...."+" a:" + a + " b:" + b); }
	 */
	
	public static void main(String[] args) {

		int a = 10, b = 20;

		System.out.println("Before Swaping Numbers..." + " a:" + a + " b:" + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swaping Numbers...." + " a:" + a + " b:" + b);
	}

}
