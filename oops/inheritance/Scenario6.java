package com.oops.inheritance;

public class Scenario6 {

	public static void main(String[] args) {
		AA a = new BB();
		BB b = new BB();
		b = (BB) a; // It looks like superclass assigned to subclass but it translates internally to
					// // BB b=new BB(); // It is equivalent to 2nd scenario.

		System.out.println("Value of x: " + a.x);
		System.out.println("Value of y: " + a.y);
		// System.out.println("Value of z: " +a.z); // Error because z does not exist in
		// class AA.

		a.msg1();
		a.msg2();
		// a.msg3(); // Compilation error.
	}
}