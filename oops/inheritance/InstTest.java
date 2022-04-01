package com.oops.inheritance;

public class InstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of class Q and call the instance variable using reference
		// variable q.
		InstVarQ q = new InstVarQ();
		System.out.println("Value of a: " + q.a);
		// 'a' of Q is called.
		// Declare superclass reference is equal to the child class object.
		InstVarP p = new InstVarQ();
		System.out.println("Value of a: " + p.a); // 'a' of P is called.
		InstVarP p1 = new InstVarP();
		System.out.println("Value of a: " + p1.a);
		InstVarQ p2 = (InstVarQ) new InstVarP();
		System.out.println("Value of a: " + p2.a);
	}
}