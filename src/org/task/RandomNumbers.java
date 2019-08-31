package org.task;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		for(int i=0;i<50;i++)
		{
			int rn = r.nextInt(50);
			System.out.println("Random Number is: " +rn);
		}
		
		for(int j=0;j<50;j++)
		{
			System.out.println("Random Float is: " +Math.random());
		}

	} 

}
