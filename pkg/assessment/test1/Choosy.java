package com.pkg.assessment.test1;

public class Choosy {

	public static void main(String[] args) {
		String result = "";
		int x = 7, y = 8;
		if (x == 3) {
			result += "1";
		} else if (x > 9) {
			result += "2";
		} else if (y < 9) {
			result += "3";
		} else if (x == 7) {
			result += "4";
		} else {
			result += "5";
		}
		System.out.println(result);
	}
}
