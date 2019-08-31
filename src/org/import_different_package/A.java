package org.import_different_package;



import org.import_same_package.*;




public class A {
	
	private void savAcc() {
		// TODO Auto-generated method stub
		
		System.out.println("Savings Account");

	}
	
	private void fixedAcc() {
		// TODO Auto-generated method stub
		
		System.out.println("Fixed Account");

	}
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.savAcc();
		obj.fixedAcc();
		
		ClientDetails cld = new ClientDetails();
		cld.clientID();
		cld.clientLocation();
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.empID();
		emp.empName();
	}

}
