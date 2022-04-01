package com.pkg.assessment.test1;

public class Bunnies {
	static int count = 0;

	Bunnies() {
		while (count < 10)
			new Bunnies(++count);
		System.out.println(count++);
	}

	Bunnies(int x) {
		super();
	}

	public static void main(String[] args) {
		new Bunnies();
		new Bunnies(count);
		System.out.println(count--);
		System.out.println(--count);
	}
}
