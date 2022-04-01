package com.pkg.problem.solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringsThatDifferByOneChar {
	// Using extra space
	public boolean solve1(String[] input) {
		Set<String> set = new HashSet<>();

		for (String str : input) {
			for (int i = 0; i < str.length(); i++) {
				String s = str.substring(0, i) + "*" + str.substring(i + 1);
				if (set.contains(s)) {
					return true;
				}
				set.add(s);
			}
		}

		return false;

	}

	// Using extra time
	public boolean solve2(String[] input) {

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (differsByOne(input[i], input[j])) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean differsByOne(String str1, String str2) {
		boolean differsByOne = false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				if (differsByOne) {
					return false;
				} else {
					differsByOne = true;
				}
			}
		}
		return true;
	}
	
	//using sort method
	public  boolean differsByOne(String[] str)
    {
        Arrays.sort(str);
        for(int i = 0; i < str.length - 1;i++){
            if(charDiff(str[i],str[i+1]) == 1){
                return true;
            }
        }
        return false;
    }
    int charDiff(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int charDiffCount = 0;
        for(int i = 0;i<c1.length;i++){
            if(c1[i] != c2[i]){
                charDiffCount++;
            }
        }
        return charDiffCount;
    }
	public static void main(String[] args) {
		StringsThatDifferByOneChar stringsThatDifferByOneChar = new StringsThatDifferByOneChar();
		String txt[] = { "abc", "xyz", "abd" };
		stringsThatDifferByOneChar.solve1(txt);
		stringsThatDifferByOneChar.solve2(txt);
		stringsThatDifferByOneChar.differsByOne(txt);
	}
}
