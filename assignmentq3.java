package org.cap.demo;

public class assignmentq3 {

	public static void main(String[] args) {
		int i =0;
		int x =0;
		String  primeNumber = "";
			
			for (i = 1; i <= 1000; i++) 
			{ 
				
				 int ctr=0;
				 for(x =i; x>=1; x--)
				 {
				 		if(i%x==0)
				 		{
							ctr = ctr + 1;
						}
				 }
				 if (ctr ==2)
				 {
				 	primeNumber = primeNumber + i + " ";
				 }
		
		
			}
			
			System.out.print("Prime numbers from 1 - 1000 are : \n" + primeNumber);
			
		}
}

