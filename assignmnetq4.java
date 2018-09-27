package org.cap.demo;

import java.util.Scanner;

public class assignmnetq4 {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. : ");
		num=s.nextInt();

		while(num!=0) {
			sum=(int) (sum+Math.pow(num%10, 3));
		num=num/10;}
		
		System.out.println(sum);

	}

}
