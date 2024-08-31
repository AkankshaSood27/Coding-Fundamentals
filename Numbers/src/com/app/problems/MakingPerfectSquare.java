/*Given a number n. what should be added or subtracted into n to make it a perfect square*/
package com.app.problems;

import java.util.Scanner;

public class MakingPerfectSquare {

	public static void main(String[] args) {
		// Input the number
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		double sqrt = Math.sqrt(n);
		long floor = (long) Math.floor(sqrt);
		long ceil = (long) Math.ceil(sqrt);
		
		long lowerPerfectSquare=floor*floor;
		long upperPerfectSquare=ceil*ceil;
		
		long result = Math.min(n-lowerPerfectSquare, upperPerfectSquare-n);
		System.out.println(result);
		sc.close();
	}

}
