package com.method.type;

public class VariableType {
	
	private int size;
	
	private static int numOfDucks;
	
	int empId;
	
	int salary;
	
	static String ceo;
	
	
	public VariableType() {
		
	}
	
	public VariableType(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	// to initialize static variables, use static blocks.
	
	static // it will exexute only once and loads at the time class loading
	{
		ceo = "Lary";
		System.out.println("Inside static block");
	}
	// to initialize instance variables, use constructor
	
	
	public void show() {
		System.out.println(empId + " : " + salary + " : " + ceo);
	}

	public VariableType(int empId, int salary) {
		this.empId = empId;
		this.salary = salary;
		System.out.println("Inside constructor");
	}

	public static void main(String[] args) {
		
		// instance variable can't be access from static methods.
		//System.out.println("Size is : "+ size);
		
		//instance variable can be access with object creation of same class
		VariableType variableType = new VariableType();
		variableType.setSize(10);
		System.out.println("Size is : "+ variableType.getSize());
		
		System.out.println(VariableType.numOfDucks);
		
		VariableType emp1 = new VariableType();
		emp1.empId = 10;
		emp1.salary = 30000;
		//VariableType.ceo = "XYZ";
		
		VariableType emp2 = new VariableType();
		emp2.empId = 20;
		emp2.salary = 40000;
		// 1. both emp1 and emp2 has same value and type is non-static variable
		//VariableType.ceo = "XYZ"; // Company has only one CEO
		// 2. both objects has different value and both are non-static
		//VariableType.ceo = "ABC";
		// 3. to make class specific, use static keyword
		
		//VariableType.ceo = "SAME";
		emp1.show();
		emp2.show();
		
		
		VariableType emp3 = new VariableType(56,3287492);
		VariableType emp4 = new VariableType(65,9877492);
		emp3.show();
		emp4.show();
		
		// every object has its own values. new VariableType() object allocate a memory in heap.
		// before creating the object, a class should be loaded in JVM and for this a special memory is
		// used called class loader memory
		
		// if we want certain variables class specific and not be object specific, then use static keyword
		// for that variable.
		
		// VariableType.ceo = "SAME"; loads first than static block initialization.
		
		/*
		 * static variables are same for all the objects and non-static variables are
		 * different for all the obejcts. Can't use non-static variable in static block.
		 */	
		}

}
