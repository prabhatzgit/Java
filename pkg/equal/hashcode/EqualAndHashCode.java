package com.pkg.equal.hashcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EqualAndHashCode {

	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "Prabhat");
		Employee employee2 = new Employee(1, "Prabhat");

		System.out.println("alex1 hashcode = " + employee1.hashCode());
		System.out.println("alex2 hashcode = " + employee2.hashCode());

		// Case1 : without overriding equal():
		// two instances have exactly the same attribute values, they are stored in
		// different memory locations. So, they are not considered equal.

		System.out.println("Checking equality between alex1 and alex2 = " + employee1.equals(employee2));

		// Case3: equals() With ArrayList

		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		System.out.println("Arraylist size = " + employeeList.size());
		System.out.println("Arraylist contains Prabhat = " + employeeList.contains(new Employee(1, "Prabhat")));

		// Case4: equals() With HashSet
		// override equals() and get the expected behavior — even though the hash code
		// of the two objects are different. So, what's the purpose of overriding
		// hashcode()?

		/*
		 * HashSet stores its elements in memory buckets. Each bucket is linked to a
		 * particular hash code. When calling employeeSet.add(employee1), Java stores
		 * employee1 inside a bucket and links it to the value of employee1.hashcode().
		 * Now any time an element with the same hash code is inserted into the set, it
		 * will just replace employee1. However, since employee2 has a different hash
		 * code, it will be stored in a separate bucket and will be considered a totally
		 * different object.
		 * 
		 * Now when HashSet searches for an element inside it, it first generates the
		 * element's hash code and looks for a bucket which corresponds to this hash
		 * code.
		 * 
		 * Here comes the importance of overriding hashcode(), so let's override it in
		 * Employee and set it to be equal to the ID so that empoyee who have the same
		 * ID are stored in the same bucket:
		 */
		HashSet<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		System.out.println("HashSet size = " + employeeSet.size());
		System.out.println("HashSet contains Alex = " + employeeSet.contains(new Employee(1, "Prabhat")));

		/*
		 * See the magic of hashcode()! The two elements are now considered as equal and
		 * stored in the same memory bucket, so any time you call contains() and pass a
		 * student object holding the same hash code, the set will be able to find the
		 * element.
		 * 
		 * The same is applied for HashMap, HashTable, or any data structure that uses a
		 * hashing mechanism for storing elements.
		 */
		func(employee1, employee2);
	}

	static void func(Object x, Object y) {
		System.out.println((x == y) + " " + x.equals(y) + " " + (x.hashCode() == y.hashCode()));
	}

}
