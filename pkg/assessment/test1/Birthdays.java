package com.pkg.assessment.test1;

import java.util.HashMap;
import java.util.Map;

public class Birthdays {

	public static void main(String[] args) {
		 Map<Friends, String> hm = new HashMap<Friends, String>();
		 hm.put(new Friends("Charis"), "Summer 2009");
		 hm.put(new Friends("Draumur"), "Spring 2002");
		 Friends f = new Friends(args[0]);
		 System.out.println(hm.get(f));
		}
}
