package org.inheritance;

public class PersonalDetails extends CompanyDetails {
	
	private void bankName() {
		
		System.out.println("Citi bank");

	}
	
	private void accDetails() {
		
		System.out.println("Savings Account");

	}
	
	public static void main(String[] args) {
		
		/*Multilevel Inheritance - A(Grand Parent)-> B(Parent) -> C(Child)
		 * class A
		 * class B extends A
		 * class C extends B
		 * 
		 * more than one parent class accessing the child class in a tress level structure
		 * 
		 */
		PersonalDetails pd = new PersonalDetails();
		
		pd.bankName();
		pd.accDetails();
		pd.cmpLoc();
		pd.cmpName();
		pd.empAdd();
		pd.empNam();
		
	}

}
