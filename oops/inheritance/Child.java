package com.oops.inheritance;

public class Child extends Parent{
	public void m3()
	{
	System.out.println("m3-method");
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
		
		Child child1 = (Child) new Parent();
		child1.m1();
		child1.m2();
		child1.m3();

		Parent parentToChild = new Child();
		parentToChild.m1();
		parentToChild.m2();
		// parentToChild.m3();
	}

}
