package com.app.problems;

import java.util.Scanner;

public class MaxSubArraySum {

	private static int findMaxSubarraySum(int[] arr) {
		int currentMaxSum = arr[0];
		int globalMaxSum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			// update currentMaxSum by comparing current element and the sum with
			// currentMaxSum
			currentMaxSum = Math.max(arr[i], currentMaxSum + arr[i]);

			// update maxGlobal if maxCurrent is greater
			if (currentMaxSum > globalMaxSum) {
				globalMaxSum = currentMaxSum;
			}
		}
		return globalMaxSum;
	}

	public static void main(String[] args) {
		// Input array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Find the maximum subarray sum
		int maxSum = findMaxSubarraySum(arr);

		// Print the maximum subarray sum
		System.out.println("Maximum subarray sum is: " + maxSum);

		sc.close();
	}

}
