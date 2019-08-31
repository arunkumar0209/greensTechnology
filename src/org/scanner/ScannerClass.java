package org.scanner;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//nextLine (Accepts space)
		
		System.out.println("Enter your Name");
		String nl = sc.nextLine();
		System.out.println("My Name is: "+nl);
		
		//next (Ignores Space)
		
		System.out.println("Enter your Last Name");
		String n = sc.next();
		System.out.println("My Last Name is: "+n);
		
		//nextInt
		
		System.out.println("Enter Reg No:");
		int ni = sc.nextInt();
		System.out.println("My Register No. is: "+ni);
		
		//nextByte
		System.out.println("Enter your Age");
		byte nb = sc.nextByte();
		System.out.println("MMy Age is: "+nb);
		
		//nextShort
		System.out.println("Enter your Employee ID");
		short ns = sc.nextShort();
		System.out.println("My Employee ID is: "+ns);
		
		//nextFloat
		System.out.println("Enter your Salary");
		float nf = sc.nextFloat();
		System.out.println("My Salary is: "+nf);
		
		//nextLong
		System.out.println("Enter your Phone No");
		long nlg = sc.nextLong();
		System.out.println("My Phone Number is: "+nlg);
		
		//nextDouble
		System.out.println("Enter your Average Weight");
		double nd = sc.nextDouble();
		System.out.println("My Average Weight is: "+nd);
		
		//nextBoolean
		System.out.println("Is She/He is an Employee");
		boolean nbo = sc.nextBoolean();
		System.out.println("Is She/He is an Employee? "+nbo);
		
	}

}
