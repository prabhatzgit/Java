package com.oops.inheritance;

public class LionTest extends Lion {
	public static void main(String[] args) {
		Animal a = new Lion();
		a.food(); // food() method of class Animal is called.
		// a.food(20); // Compile time error.

		Lion l = new Lion();
		l.food(); // food() method of class Lion is called.
		l.food(10); // food() method of class Lion is called.
	}
}