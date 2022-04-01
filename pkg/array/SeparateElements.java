package com.pkg.array;

import java.util.Arrays;

public class SeparateElements {
	
	private int[] sortArrayByParity(int[] A) {
		int even = -1;
		int temp;
		
		for(int i = 0; i < A.length; i++) {
			if(A[i] %2 ==0) {
				even++;
			}
			temp = A[i];
			A[i] = A[even];
			A[even] = temp;
		}
		return A;
	}
	public static void main(String[] args) {
		SeparateElements separateElements = new SeparateElements();
		int[] A = {2,1,0,3,4,5,7};
		separateElements.sortArrayByParity(A);
		Arrays.toString(A);
	}

}
