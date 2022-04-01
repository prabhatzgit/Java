package com.pkg.equal.hashcode;

import java.util.HashMap;
import java.util.Map;

public class EqualHashCode {

	public static void main(String[] args) {
		EmployeePOJO emp1 = new EmployeePOJO(1);
		EmployeePOJO emp2 = new EmployeePOJO(1);

		Map<EmployeePOJO, String> map = new HashMap<EmployeePOJO, String>();
		map.put(emp1, "Prahbat");
		map.put(emp2, "Prahbat");

		// Case1: without overriding hashcode duplicate will allow. with hashcode
		// duplicates will not allow.
		System.out.println("map.size(): " + map.size()); // op - 2

		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(int1, "one");
		map1.put(int2, "one");
		// wrapper class equal and hashcode implemented by default.
		System.out.println("map1.size(): " + map1.size()); // op -1
	}

}

class EmployeePOJO {

	private int empId;

	public EmployeePOJO(int empId) {
		this.empId = empId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePOJO other = (EmployeePOJO) obj;
		if (empId != other.empId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeePOJO [empId=" + empId + "]";
	}

}