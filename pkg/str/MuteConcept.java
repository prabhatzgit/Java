package com.pkg.str;

public class MuteConcept {

	public static void main(String[] args) {

		String s = "Durga";
		s.concat("Software"); // o/p - DurgaSoftware. But this string is not referenced. So it garbage
								// collected.
		System.out.println(s); // o/p - Durga

		StringBuffer s1 = new StringBuffer("Durga");
		s1.append("Software"); // o/p - DurgaSoftware
		System.out.println(s1); // o/p - DurgaSoftware
	}

}
