package org.functional.Sortings;

import org.functional.Arrays.GPTArrayQuestions;

public class SelectionSort {

    //   GPTArrayQuestions printingFunction = new GPTArrayQuestions();


//    Here’s a summary of the selection sort steps:
//
//      1. Start from the first index and treat it as the beginning of the unsorted range.
//      2. Find the minimum element within the current unsorted range.
//      3. Swap the minimum element with the first element of the unsorted range.
//      4. Move the starting index of the unsorted range to the right, effectively shrinking the unsorted portion.
//      5. Repeat steps 2-4 until the entire array is sorted.
//    After each iteration, the array becomes sorted up to the new starting index.

    static void selectionSort(Integer[] arr) {

        System.out.println("==========================================================================================================");
        // Print the initial state of the array
        PrintArray(arr, "Function Initially");

        // Loop through the array (excluding the last element, as it's already sorted)
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the current index is the minimum
            int min = i;
            // Loop through the remaining unsorted portion of the array
            for (int j = i + 1; j < arr.length; j++) {
                // If a smaller element is found, update the minimum index
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap the smallest element found with the first element of the unsorted portion
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Print the final sorted state of the array
        PrintArray(arr, "Function Finally");
    }


    public static void main(String[] args) {
//        Integer[] arr = {15, 3, 9, 25, 18, 7, 30, 2, 14, 5, 11, 27, 6, 20, 8, 12, 1, 17, 4, 23};
        Integer[] arr = {5,1,1,2,0,0};

        selectionSort(arr);
    }

    static void PrintArray(Integer[] arr, String state) {

        System.out.print("The " + state + " array is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }




}

