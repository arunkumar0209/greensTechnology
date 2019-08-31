package org.constructor;

public class Emp {
	
	public Emp() {
		this(456);
		System.out.println("Default constructor");
	}
	
	public Emp(int empId) {
		this("Saranya");
		System.out.println(empId);
		
	}
	
	public Emp(String name) {
		this(67.89f);
		System.out.println(name);
	}
	
	public Emp(float avg) {
		System.out.println(avg);
	}

	public static void main(String[] args) {
		Emp e= new Emp();
		
	}
}
