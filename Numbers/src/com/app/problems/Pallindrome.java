/*WAP to check whether the give number is pallindrome or not*/
package com.app.problems;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int rem=0;
		int temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/0;
		}
		if(n==rev) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();
	}

}
