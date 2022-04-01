package com.pkg.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Employee {

	private int empId;

	private String empName;

	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

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
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(empName, other.empName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(new Employee(1,"Prabhat"));
		listEmployee.add(new Employee(1,"Prabhat"));
		System.out.println(listEmployee);
		
		HashMap<Integer, Employee> hashMap = new HashMap<>();
		hashMap.put(1, new Employee(2,"Prabhat"));
		hashMap.put(1, new Employee(2,"Prabhat"));
		
		System.out.println(hashMap);
	}

}
