package com.pkg.problem.solving;

import java.util.HashMap;

public class FractionToDecimal {
	public double fractionToDecimal(int numerator, int denominator) {
		// Initialize result
		String res = "";
		int fractionValue;
	    int decimal;
	    double value;
		double num = (double)numerator/denominator;
	    fractionValue = (int) (num * 10);
	    decimal = fractionValue % 10;
	    value = decimal * 0.1;
		System.out.println(value);
		// Create a map to store already
		// seen remainders. Remainder is
		// used as key and its position in
		// result is stored as value.
		// Note that we need position for
		// cases like 1/6. In this case,
		// the recurring sequence doesn't
		// start from first remainder.
		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.clear();

		// Find first remainder
		int rem = numerator % denominator;

		// Keep finding remainder until
		// either remainder becomes 0 or repeats
		while ((rem != 0) && (!mp.containsKey(rem))) {
			// Store this remainder
			mp.put(rem, res.length());

			// Multiply remainder with 10
			rem = rem * 10;

			// Append rem / denr to result
			int res_part = rem / denominator;
			res += String.valueOf(res_part);

			// Update remainder
			rem = rem % denominator;
		}

		return value;
	}

	public static void main(String[] args) {
		int numr = 1, denr = 2;
		FractionToDecimal solution = new FractionToDecimal();
		double res = solution.fractionToDecimal(numr, denr);
			System.out.print("Recurring sequence is " + res);
	}
}