package com.oops.inheritance;

public class Scenario2 {
	public static void main(String[] args) {
		// Create an object of class BB.
		BB b = new BB(); // Here, 'b' is reference variable of class BB and pointing to the object of
							// class BB.
		System.out.println("Value of x: " + b.x); // x of class BB is called because by default, x of class AA is
													// available in class BB through inheritance.

		System.out.println("Value of y: " + b.y); // y of class BB is called, not of class AA because the object is
													// created for class BB.
		System.out.println("Value of z: " + b.z); // z of class BB is called.

		b.msg1(); // msg1 of class BB is called because it is available in class BB by default.
		b.msg2(); // msg2 of class BB is called, not of class AA because an object is created for
					// class BB.
		b.msg3();
	}
}
