package com.pkg.equal.hashcode;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// overriding of equals method
	// Case2: two employee are equal if and only if they are stored in the same
	// memory address OR they have the same ID. hash code of the two objects are
	// different.
	// Now equality check of two objects will show true

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	// Case4: overriding of hash code method

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	
	/*
	 * 1. If two objects are equal, they MUST have the same hash code. 
	 * 2. If two objects have the same hash code, it doesn't mean that they are equal. 
	 * 3. Overriding equals() alone will make your business fail with hashing data structures like: HashSet, HashMap, HashTable ... etc. 
	 * 4. Overriding hashcode() alone doesn't force Java to ignore memory addresses when comparing two objects.
	 */
}
