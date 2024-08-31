/*Accept two numbers and calculate GCD(HCF) of them.*/
package com.app.problems;

import java.util.Scanner;

public class HCF {

	public static int gcd(int a,int b) {
		int temp;
		while(b!=0){
		    temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static int lcm(int a,int b) {
		return a*b/gcd(a,b);
	}
	public static void main(String[] args) {
		// find the GCD of two numbers using the Euclidean algorithm
		Scanner sc=new Scanner(System.in); 
		int a, b;
		 System.out.println("Enter two numbers: ");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 //Handling negative numbers
		 a=(a>0)?a:-a;
		 b=(b>0)?b:-b;
		 System.out.println("Using user defined function");
		 System.out.println("GCD is: "+gcd(a,b));
	
		 sc.close();
		 
		 
	}

}
