/*WAP, given an arrayList of valid strings the valid strings can 
 * only contain A,e,C,g,m,T,s,L and number of T's should be more 
 * than the number of A's. you have to sort it in the lexical 
 * order and Use StringJoiner to join the strings using '-' and 
 * print all the strings with StringJoiner*/
package com.app.problems;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

public class ValidStrings {

	public static void main(String[] args) {
		// Initialize the list of strings
		List<String> strings = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter strings, type 'done' to stop:");
		while (true) {
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("done")) {
				break;
			}
			strings.add(input);
		}

		// List to hold only the valid strings
		List<String> validStrings = new ArrayList<>();

		for (String str : strings) {
			if (isValidString(str) && hasMoreTsThanAs(str)) {
				validStrings.add(str);
			}
		}
		Collections.sort(validStrings);

		StringJoiner joiner = new StringJoiner("-");

		for (String validStr : validStrings) {
			joiner.add(validStr);
		}
		System.out.println(joiner);
		sc.close();
	}

	private static boolean hasMoreTsThanAs(String str) {
		int countT = 0;
		int countA = 0;
		for (char ch : str.toCharArray()) {
			if (ch == 'T') {
				countT++;
			} else if (ch == 'A') {
				countA++;
			}
		}
		return countT > countA;
	}

	private static boolean isValidString(String str) {
		String validChars = "AeCgmsTL";
		for (char ch : str.toCharArray()) {
			if (!validChars.contains(String.valueOf(ch))) {
				return false;
			}
		}
		return true;
	}

}
