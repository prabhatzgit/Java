package com.pkg.assessment.test2;

import java.text.NumberFormat;

public class Gazillion {
	public static void main(String[] args) throws Exception {
		String s = "123.456xyz";
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.parse(s));
		nf.setMaximumFractionDigits(2);
		System.out.println(nf.format(s));
	}
}