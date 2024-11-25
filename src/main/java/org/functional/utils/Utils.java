package org.functional.utils;

/**
 * Utility class for array and matrix operations.
 * Provides helper methods for common array and matrix manipulations.
 */
public class Utils {

    // Marks all elements in the given row with -1, except those that are 0
    public static void markRows(int[][] arr, int row, int column, int i) {
        for (int j = 0; j < column; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    // Marks all elements in the given column with -1, except those that are 0
    public static void markColumns(int[][] arr, int row, int column, int j) {
        for (int i = 0; i < row; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    // Reverses the elements of the array from index `first` to `last`
    public static void reverseArrayHelper(Integer[] arr, int first, int last) {
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    // Performs a linear search for a number in the array
    public static Boolean linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    // Swaps two elements in an array
    public static void swapHelper(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Prints a 2D matrix in a readable format
    public static void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // this is a Print Method will use whenever need to Print the Array
    public static void PrintArray(Integer[] arr, String color) {

        System.out.print(color + "The final output is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }


}
