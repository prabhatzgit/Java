package com.oops.inheritance;

public class InstBlockNConstHi extends InstBlockNConstHello {

	InstBlockNConstHi() {
		System.out.println("Hi constructor");
	}

	void show() { // Override the show() method.
		System.out.println("Hi method");
	}
}