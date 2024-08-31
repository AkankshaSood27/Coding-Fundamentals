/*Problem Statement: 
 * Given a matrix if an element in the matrix is 0 
 * then you will have to set its entire column and 
 * row to 0 and then return the matrix.*/
package com.app.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeros {

	public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m) {

		int[] row = new int[n];// row array
		int[] col = new int[m];// column array

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix.get(i).get(j) == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		// Finally mark all (i,j) as 0 iff row[i] or col[i] is marked with 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (row[i] == 1 || col[j] == 1) {
					matrix.get(i).set(j, 0);
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

		System.out.println("Enter the elements of your 3x3 matrix, 0 or 1 only");
		matrix.add(new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())));
		matrix.add(new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())));
		matrix.add(new ArrayList<>(Arrays.asList(sc.nextInt(), sc.nextInt(), sc.nextInt())));

		int n = matrix.size();
		int m = matrix.get(0).size();

		ArrayList<ArrayList<Integer>> ans = zeroMatrix(matrix, n, m);

		System.out.println("The final matrix is:");
		for (ArrayList<Integer> row : ans) {
			for (Integer e : row) {
				System.out.print(e + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
