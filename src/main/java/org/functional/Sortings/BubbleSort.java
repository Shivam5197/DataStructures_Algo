package org.functional.Sortings;

public class BubbleSort {


    public static void main(String[] args) {
        Integer[] arr = {15, 3, 9, 25, 18, 7, 30, 2, 14, 5, 11, 27, 6, 20, 8, 12, 1, 17, 4, 23};
        System.out.println();
        int n = arr.length;
        bubbleSort(arr);
    }

//    Bubble Sort Approach (Summary):
//            1. Outer Loop (Backward): Iterate from the last index to the first, narrowing the unsorted range.
//            2. Inner Loop (Forward): Compare and swap adjacent elements to push the largest element to the end of the unsorted range.
//            3. Swapping Condition: Swap if the current element is larger than the next (`arr[j] > arr[j+1]`).
//            4. Result After Each Iteration: The end of the array becomes sorted incrementally.
//            5. Completion: After `(n-1)` iterations, the entire array is sorted.
//

    static void bubbleSort(Integer[] arr) {
        System.out.println("-===============================================================================================-");
        PrintArray(arr, "Initial Function");

        // Outer loop: iterates from the end of the array down to the beginning
        for (int i = arr.length - 1; i >= 0; i--) {
            // Inner loop: goes through the array up to the current end (i)
            for (int j = 0; j < i; j++) {
                // If the current element is greater than the next, swap them
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];  // Temporary variable to hold arr[j] value
                    arr[j] = arr[j + 1]; // Move the next element to the current position
                    arr[j + 1] = temp;   // Assign the temporary value to the next position
                }
            }
        }

        // Print the final sorted state of the array
        PrintArray(arr, "Final");
    }



    static void PrintArray(Integer[] arr, String state) {

        System.out.print("The " + state + " array is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }



}
