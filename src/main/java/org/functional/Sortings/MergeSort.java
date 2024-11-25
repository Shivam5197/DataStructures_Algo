package org.functional.Sortings;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {


//    Here’s a simplified version of the merge sort approach in points:
//
//            1. Recursive Function (`mergeSort`):
//            - Divide the array range into two halves using `mid = (low + high) / 2`.
//            - Recursively sort the left half with `mergeSort(arr, low, mid)`.
//            - Recursively sort the right half with `mergeSort(arr, mid + 1, high)`.
//
//            2. Base Case:
//            - If the array has only one element (`low >= high`), stop the recursion.
//
//            3. Merging (`merge`):
//            - Combine the sorted halves back together to maintain order.
//
//    This approach uses a divide-and-conquer strategy to sort the array recursively.


    //Merge sort works as Divide and Merge technique
    public static void main(String[] args) {

        Integer[] arr = {15, 3, 9, 25, 18, 7, 30, 2, 14, 5, 11, 27, 6, 20, 8, 12, 1, 17, 4, 23};
        System.out.println();
        //Given aray is
        PrintArray(arr, "Initial");
        int firstIndex = 0;  // it represents 0 index in array
        int lastIndex = arr.length - 1;  // it represents last index in array

       mergeSort(arr, firstIndex, lastIndex);
      //  mergeSortNew(arr, firstIndex, lastIndex);

        PrintArray(arr, "Final");

    }

    public static void mergeSort(Integer[] arr, int firstIndex, int lastIndex) {
        // If the array has one or no elements, it's already sorted
        if (firstIndex >= lastIndex) {
            return;
        }

        // Find the middle index to divide the array into two halves
        int mid = (firstIndex + lastIndex) / 2;

        // Recursively sort the first half
        mergeSort(arr, firstIndex, mid);

        // Recursively sort the second half
        mergeSort(arr, mid + 1, lastIndex);

        // Merge the sorted halves
        mergeFunction(arr, firstIndex, mid, lastIndex);
    }

    static void mergeFunction(Integer[] arr, int firstIndex, int mid, int lastIndex) {
        List<Integer> temp = new ArrayList<>();
        // Temporary list to store the merged sorted elements

        int left = firstIndex;
        int right = mid + 1;

        // Merge elements from the two halves [firstIndex to mid] and [mid+1 to lastIndex]
        while (left <= mid && right <= lastIndex) {
            if (arr[left] <= arr[right]) {
                // If the element in the left half is smaller or equal, add it to the temp list
                temp.add(arr[left]);
                left++;
            } else {
                // If the element in the right half is smaller, add it to the temp list
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy the remaining elements from the left half, if any
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        // Copy the remaining elements from the right half, if any
        while (right <= lastIndex) {
            temp.add(arr[right]);
            right++;
        }

        // Copy the merged elements back to the original array
        for (int i = 0; i < temp.size(); i++) {
            arr[firstIndex + i] = temp.get(i);
        }
    }





    static void PrintArray(Integer[] arr, String state) {

        System.out.print("The " + state + " array is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

}
