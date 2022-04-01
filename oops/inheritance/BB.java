package com.oops.inheritance;

public class BB extends AA {
	int y = 50;
	int z = 60; // Overridding method.

	void msg2() {
		System.out.println("I am msg2 in class BB");
	}

	void msg3() {
		System.out.println("I am msg3 in class BB");
	}
}