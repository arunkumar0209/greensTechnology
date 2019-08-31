package org.import_same_package;

public class ClientDetails {
	
	private void clientName() {
		// TODO Auto-generated method stub
		
		System.out.println("Delta");

	}
	
	public void clientID() {
		// TODO Auto-generated method stub
		
		System.out.println("9876");

	}
	
	public void clientLocation() {
		// TODO Auto-generated method stub
		
		System.out.println("USA");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientDetails cld = new ClientDetails();
		cld.clientName();
		cld.clientID();
		cld.clientLocation();
		
		EmployeeDetails emp = new EmployeeDetails();
		emp.empID();
		emp.empName();

	}

}
