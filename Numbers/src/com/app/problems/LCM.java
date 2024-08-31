package com.app.problems;

import java.util.Scanner;

public class LCM {

	public static int lcm(int a, int b) {
		//find max of the two numbers
		int max=(a>b)?a:b;
		
		//iterate to find first common multiple---> lcm
		while(true) {
			if(max%a==0 && max%b==0) {
				return max;
			}
			max++;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int a, b;
		 System.out.println("Enter two numbers: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 //Handling negative numbers
		 a=(a>0)?a:-a;
		 b=(b>0)?b:-b;
		 System.out.println("Using user defined function");
		 System.out.println("LCM is: "+lcm(a,b));
		 sc.close();

	}

}
