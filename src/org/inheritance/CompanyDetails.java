package org.inheritance;

public class CompanyDetails extends EmployeeDetails{
	
	public void cmpName() {
				
		System.out.println("BNYM");

	}
	
	public void cmpLoc() {
				
		System.out.println("OMR");

	}
	
	public static void main(String[] args) {
		
		//Single Inheritance - Combination of one child and one parent class is known as Single Inheritance
		CompanyDetails cd = new CompanyDetails();
		cd.cmpName();
		cd.cmpLoc();
		cd.empNam();
		cd.empAdd();
		
		
	}

}
