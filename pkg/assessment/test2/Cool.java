package com.pkg.assessment.test2;

public class Cool extends SuperCool {
	public static void main(String[] args) {
		new Cool().go();
	}

	void go() {
		SuperCool s = new Cool();
		Cool c = (Cool) s;
		// insert code here
		s.doStuff();
	}

	void doStuff() {
		os += "cool ";
	}
}
