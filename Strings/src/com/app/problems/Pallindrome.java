package com.app.problems;

import java.util.Scanner;

public class Pallindrome {

	private static boolean isPallindrome(String string) {
		String reversed=new StringBuilder(string).reverse().toString();
		return string.equals(reversed);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		System.out.println(isPallindrome(sc.next().toLowerCase()));
		sc.close();
	}

}
