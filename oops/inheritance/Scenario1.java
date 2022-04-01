package com.oops.inheritance;

public class Scenario1 {
	public static void main(String[] args) {
		// Scenario 1.
		// Create an object of class AA.
		AA a = new AA(); // 'a' is reference variable of class A and pointing to the object of class AA.
							// Therefore, superclass object reference a is eligible to call only A.

		System.out.println("Value of x: " + a.x); // x of class AA is called.
		System.out.println("Value of y: " + a.y); // y of class AA is called.

		// System.out.println("Value of z: " +a.z); // // Error because z does not exist
		// in AA. // Call msg1() and msg2() methods using reference variable a.
		a.msg1(); // msg1 of class AA is called.
		a.msg2(); // msg2 of class AA is called.
		// a.msg3(); //Error because the method msg3 does not exist in AA.
	}
}
