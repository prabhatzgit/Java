package com.oops.inheritance;

public class Scenario3 {
	public static void main(String[] args) {
		// Superclass reference is equal to child class object.
		AA a = new BB(); // 'a' is reference variable of class AA but pointing to the object of class BB.
		System.out.println("Value of x: " + a.x); // x of class AA is called.
		System.out.println("Value of y: " + a.y); // y of class AA is called.

		// System.out.println("Value of z: " +a.z); // Error because z does not exist in
		// AA.
		a.msg1(); // msg1 of class BB is called because it is available by default in class BB.
		a.msg2(); // The overridden msg2 of class BB is called because object is created for class
					// BB.
		// a.msg3(); // Error because msg3 does not exist in AA. msg3() is newly created
		// method in class BB that cannot be called by using reference variable 'a' of
		// superclass and pointing to the object of subclass.
	}
}
