package com.instance.statik.area;

public class InstanceVariable {
	int a = 10;
	int b = 20;
	int c;
	void add() {
		c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariable t = new InstanceVariable();
		System.out.println(t.a +", "+ t.b+", "+ t.c);
		t.add();
	}

}
