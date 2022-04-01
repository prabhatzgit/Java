package com.pkg.assessment.test2;

import java.util.TreeSet;

public class Corner {

	public static void main(String[] args) {
		TreeSet<String> t1 = new TreeSet<String>();
		TreeSet<String> t2 = new TreeSet<String>();
		t1.add("b");
		t1.add("7");
		t2 = (TreeSet) t1.subSet("5", "c");
		try {
			t1.add("d");
			t2.add("6");
			t2.add("3");
		} catch (Exception e) {
			System.out.print("ex ");
		}
		System.out.println(t1 + " " + t2);
	}
}
