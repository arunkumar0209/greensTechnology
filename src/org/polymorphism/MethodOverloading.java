package org.polymorphism;

public class MethodOverloading {
	
	//Depends on DataType
			public void findEmployee (int empID) {
				System.out.println("My Employee ID is "+empID);
			}
			
			//Depends on DataType Order
			public void findEmployee (int empID, String empName) {
				System.out.println("My Employee ID is " +empID +" and My Name is "+empName);
			}
			
			//Depends on Count
			public void findEmployee (String empName, int empID, long phoneNo , float salary) {
				
				System.out.println("My Name is " +empName+" and My Employee ID is "+empID+" and My Phone Number is "+phoneNo+" and Salary is "+salary);
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mol = new MethodOverloading();
		
		mol.findEmployee(5747);
		mol.findEmployee(5747, "Arun Kumar S");
		mol.findEmployee("Arun Kumar S", 5747, 123456789, 41456.23f);
		
		System.out.println("done");

	}

}
