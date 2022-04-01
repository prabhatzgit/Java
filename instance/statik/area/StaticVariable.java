package com.instance.statik.area;

public class StaticVariable {

	static int a = 10;
	static int b = 20;
	
	// calling of static variable
	static int x = 100;

	public static void main(String[] args) {
		System.out.println(a + b);
		StaticVariable s = new StaticVariable();
		s.add();
		StaticVariable.a = 20;
		System.out.println(a);
		
		//1-way(directly possible) 
		System.out.println(x);
		//2-way(By using class name)   
		System.out.println(StaticVariable.a);
		//3-way(By using reference variable)   
		StaticVariable t=new StaticVariable();   
		System.out.println(t.a);
	}

	void add() {
		System.out.println(a + b);
	}
}
