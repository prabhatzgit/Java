package com.pkg.str;

public class ReverseString {

	public static void main(String[] args) {
		String str = "TODO Auto-generated method stub";
		String newStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			newStr += str.charAt(i);
		}
		System.out.println(newStr);

	}

}
