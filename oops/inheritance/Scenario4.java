package com.oops.inheritance;

public class Scenario4 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		a = b;

		System.out.println("Value of x: " + a.x);
		System.out.println("Value of y: " + a.y);

		// System.out.println("Value of z: " +a.z); // Error because z does not exist in
		// class AA.
		a.msg1();
		a.msg2();
		// a.msg3(); // Error msg3 of class AA not exist.
		
		//BB b1 = new AA(); // Syntax error. // Try calling everything by using b. 
	}
}
