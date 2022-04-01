package com.pkg.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class EmployeeComparable implements Comparable<EmployeeComparable> {

	private int empId;
	private String empName;
	private int empAge;
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public EmployeeComparable(int empId, String empName, int empAge) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	@Override
	public int compareTo(EmployeeComparable o) {
		// TODO Auto-generated method stub
		if (empAge == o.empAge) {
			return 0;
		} else if (empAge > o.empAge) {
			return 1;
		} else
			return -1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empAge, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeComparable other = (EmployeeComparable) obj;
		return empAge == other.empAge && empId == other.empId && Objects.equals(empName, other.empName);
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeeComparable> al = new ArrayList<EmployeeComparable>();
		al.add(new EmployeeComparable(101, "Vijay", 23));
		al.add(new EmployeeComparable(106, "Ajay", 27));
		al.add(new EmployeeComparable(105, "Jai", 21));

		Collections.sort(al);

		for (EmployeeComparable emp : al) {
			System.out.println("emp id : " + emp.empId + " emp name : " + emp.empName + " emp age : " + emp.empAge);
		}
	}

}
