/*Given an unsorted array arr[ ] having 
 * both negative and positive integers. 
 * The task is to place all negative elements at the end 
 * of the array without changing the order of positive 
 * elements and negative elements.*/
package com.app.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveAllNegativeElementsToEnd {

	public static void rearrangeArray(int[] arr) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();

        // Separate positive and negative numbers into two lists
        for (int num : arr) {
            if (num >= 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        // Combine positives and negatives back into the original array
        int index = 0;

        // Add all positive numbers first
        for (int num : positives) {
            arr[index++] = num;
        }

        // Then add all negative numbers
        for (int num : negatives) {
            arr[index++] = num;
        }
    }

    public static void main(String[] args) {
        // Input array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (both positive and negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rearrange the array
        rearrangeArray(arr);

        // Print the rearranged array
        System.out.println("Rearranged array with negative elements at the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }

}
