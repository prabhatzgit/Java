package com.oops.inheritance;

public class InstBlockNConstHello {
	// Declare an instance block.
	{
		show();
	}

	InstBlockNConstHello() {
		System.out.println("Hello constructor");
		show();
	}

	void show() {
		System.out.println("Hello method");
	}
}
