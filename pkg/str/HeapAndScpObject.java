package com.pkg.str;

public class HeapAndScpObject {

	public static void main(String[] args) {
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		String s3 = "Durga";
		String s4 = "Durga";
		// How many objects will create and how many in heap and SCP
		System.out.println("s1: " + s1.hashCode());
		System.out.println("s2: " + s2.hashCode());
		System.out.println("s3: " + s3.hashCode());
		System.out.println("s4: " + s4.hashCode());

		// Case2:
		String s5 = new String("Prabhat");
		s5.concat("Ranjan");
		s5 = s5.concat("Mahanty");
		System.out.println("s4: " + s5);

		// Case3:
		String s11 = new String("You can't change me");
		String s12 = new String("You can't change me");
		System.out.println(s11 == s12); // false

		String s13 = "You can't change me";
		System.out.println(s11 == s13); // false

		String s14 = "You can't change me";
		System.out.println(s13 == s14); // true

		String s15 = "You can't " + "change me"; // Both are constants add and same as s14. New objects won't be create.
		System.out.println(s14 == s15); // true
		
		String s16 = "You can't ";
		String s17 = s16 + "change me"; // this operation performed at runtime only
		System.out.println(s17);
		System.out.println(s14 == s17); // false bcoz s14 points to SCP and s17 points to heap.
		
		final String s18 = "You can't ";
		String s19 = s18 + "change me"; // this operation performs at compile time.
		System.out.println(s14 == s19); 
	}

}
