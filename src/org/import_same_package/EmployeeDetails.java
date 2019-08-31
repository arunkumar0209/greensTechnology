package org.import_same_package;

public class EmployeeDetails {
	
	public void empName() {
		// TODO Auto-generated method stub
		
		System.out.println("Arun Kumar");

	}
	
	public void empID() {
		// TODO Auto-generated method stub
		
		
		System.out.println(12345);

	}
	
	private void empLocation() {
		// TODO Auto-generated method stub
		
		System.out.println("Chennai");

	}
	
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.empName();
		emp.empID();
		emp.empLocation();
	}

}
