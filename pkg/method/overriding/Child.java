package com.pkg.method.overriding;

public class Child extends Parent {
	void marry() {
		System.out.println("white girl/red girl");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.property();
		c.marry();
		Parent p = new Parent();
		p.property();
		p.marry();
	}
}