package org.cap.demo;

import java.util.Scanner;

public class assignmentq2 {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no. : ");
		num=s.nextInt();

		while(num!=0) {
			sum=sum+num%10;
		num=num/10;}
		
		System.out.println(sum);

	}

}
