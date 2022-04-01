package com.pkg.assessment.test2;

public class Sample {

	static String s = "";

	public static void main(String[] args) {
		try {
			main1(args);
		} catch (Error e) {
			s += "e ";
		}
		s += "x ";
		System.out.println(s);
	}

	public static void main1(String[] args) {
		if (args.length == 0)
			throw new IllegalArgumentException();
		s += "d ";
	}
}
