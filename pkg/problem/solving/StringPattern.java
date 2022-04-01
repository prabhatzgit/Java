package com.pkg.problem.solving;

public class StringPattern {
	static void computeLPSArray(String str, int M, int lps[]) {
		int len = 0;

		int i;

		lps[0] = 0;
		i = 1;
		while (i < M) {
			if (str.charAt(i) == str.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if (len != 0) {
					len = lps[len - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
	}

	static boolean isRepeat(String str) {
		int n = str.length();
		int lps[] = new int[n];
		computeLPSArray(str, n, lps);
		int len = lps[n - 1];
		return (len > 0 && n % (n - len) == 0) ? true : false;
	}

	public static void main(String[] args) {
		String txt[] = { "ABCABC", "ABABAB", "ABCDABCD", "GEEKSFORGEEKS", "GEEKGEEK", "AAAACAAAAC", "ABCDABC" };
		int n = txt.length;
		for (int i = 0; i < n; i++) {
			if (isRepeat(txt[i]) == true)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
