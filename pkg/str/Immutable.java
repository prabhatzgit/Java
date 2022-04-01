package com.pkg.str;

public final class Immutable {

	// An immutable class
	final String name;
	final int regNo;

	public Immutable(String s, int i) {
		this.name = s;
		this.regNo = i;
	}

	public String getName() {
		return name;
	}

	public int getRegNo() {
		return regNo;
	}

	public static void main(String args[]) {
		Immutable s = new Immutable("ABC", 101);
		System.out.println(s.getName());
		System.out.println(s.getRegNo());

		// Uncommenting below line causes error
		// s.regNo = 102;
	}
}
