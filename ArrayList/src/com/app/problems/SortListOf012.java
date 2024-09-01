/*Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo*/
package com.app.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SortListOf012 {

	public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp=arr.get(i);
        arr.set(i,arr.get(j));
        arr.set(j,temp);
    }
    // Function to sort an array of 0s, 1s, and 2s
    public static void sortArrayList(ArrayList<Integer> arr) {
        // code here
       int low=0;
       int mid=0;
       int high=arr.size()-1;
       while(mid<=high){
           switch(arr.get(mid)){
               case 0:
                   //swap mid and low
                   swap(arr,low,mid);
                   low++;
                   mid++;
                   break;
                case 1:
                    //only increment mid
                    mid++;
                    break;
                case 2:
                    //swap mid and high
                    swap(arr,mid,high);
                    high--;
                    break;
           }
       }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the ArrayList:");
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter elements (only 0, 1, 2 are allowed):");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            // Ensuring only 0, 1, or 2 is entered
            if (element == 0 || element == 1 || element == 2) {
                arr.add(element);
            } else {
                System.out.println("Invalid input. Please enter only 0, 1, or 2.");
                i--; // Decrement to take input again
            }
        }

        // Sort the ArrayList
        sortArrayList(arr);

        // Print the sorted ArrayList
        System.out.println("Sorted ArrayList: " + arr);

        sc.close();
    }

}
