package org.pkg.list;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(0, 1);
		list1.add(1, 2);
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		System.out.println(list2);
		list1.addAll(1,list2);
		System.out.println(list1);
	}

}
