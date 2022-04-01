package com.pkg.str;

public class CheckStringPalindrome {

	public static void main(String[] args) {
		//String str = "TODO Auto-generated method stub";
		String str = "Nitin";
		String revStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		if (str.equalsIgnoreCase(revStr)) {
			System.out.println("Given string is a Palindrome : " + str);
		}else
		System.out.println("Given string is not a Palindrome : " + str);
	}

}
