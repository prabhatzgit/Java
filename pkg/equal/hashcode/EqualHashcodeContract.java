package com.pkg.equal.hashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EqualHashcodeContract {

	static Map<Department, String> loaddeptData() {
		Department dept1 = new Department("100", "10101984");
		Department dept2 = new Department("101", "11101984");
		Department dept3 = new Department("102", "12101984");

		Map<Department, String> deptData = new HashMap<>();
		deptData.put(dept1, "Prabhat");
		deptData.put(dept2, "Ranjan");
		deptData.put(dept3, "Mahanty");

		return deptData;
	}

	public static void main(String[] args) {
		Map<Department, String> deptData = loaddeptData();
		System.out.println("deptData: " + deptData);
		Department deptKey = new Department("101", "11101984");
		System.out.println("deptKey: " + deptKey);
		String deptName = deptData.get(deptKey);
		System.out.println("deptName: " + deptName);

		// Case2: Hash set with and without hash code
		Department dept4 = new Department("100", "10101984");
		Department dept5 = new Department("101", "11101984");
		Department dept6 = new Department("102", "12101984");
		Department dept7 = new Department("100", "10101984");
		Department dept8 = new Department("101", "11101984");
		Department dept9 = new Department("102", "12101984");

		Set<Department> deptSet = new HashSet<>();
		deptSet.add(dept4);
		deptSet.add(dept5);
		deptSet.add(dept6);
		deptSet.add(dept7);
		deptSet.add(dept8);
		deptSet.add(dept9);

		System.out.println("deptSet: " + deptSet);
	}
}
