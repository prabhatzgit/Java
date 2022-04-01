package com.oops.inheritance;

public class OverMethChildclass extends OverMethBaseClass {
	int x = 50;
	int y = 100;

	// Overriding method.
	void msg() {
		System.out.println("Child class first method");
	}

	void msg2() {
		System.out.println("Child class second method");
	}
}
