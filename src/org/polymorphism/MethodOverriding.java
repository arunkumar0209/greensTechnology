package org.polymorphism;

public class MethodOverriding extends RBI {
	
	public void brDetails() {
		System.out.println("Chennai");
	}
	
	public void savAcc() {
		System.out.println("6%");
	}
	
	public static void main(String[] args) {
		
		MethodOverriding mor = new MethodOverriding();
		
		mor.brDetails();
		mor.savAcc();
		mor.fixDep();
	}

}
