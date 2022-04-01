package com.oops.inheritance;

public class OverMethMyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverMethChildclass obj = new OverMethChildclass();
		System.out.println("Value of x: " + obj.x); // x of class Childclass is called.
		obj.msg(); // msg() of Childclass is called.
		obj.msg2(); // msg2() of Childclass is called.

		OverMethBaseClass obj2 = new OverMethChildclass();
		System.out.println("Value of x: " + obj2.x); // x of Baseclass is called.

		// System.out.println("Value of y: " +obj2.y); // Error because y does not exist
		// in Baseclass.
		obj2.msg(); // msg() of Childclass is called.
		// obj2.msg2(); // Error because the method msg2() does not exist in Baseclass.
		// OverMethChildclass obj3 = new OverMethBaseClass();
	}
}