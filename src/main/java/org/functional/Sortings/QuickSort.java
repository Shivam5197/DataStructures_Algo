package org.functional.Sortings;

public class QuickSort {


//    Summary of Quick Sort Steps
//
//            1. Initialization: Set the low pointer to the first index and the high pointer to the last index of the array.
//            2. Partitioning: Use the `partition()` function to find the index where the pivot element should be placed, effectively separating smaller and larger elements.
//            3. Recursive Calls: Call `quickSort()` recursively for the left subarray (`low` to `partition index - 1`) and the right subarray (`partition index + 1` to `high`).
//            4. Termination: Continue the recursion until the subarray ranges reduce to a single element.


    public static void main(String[] args) {
        Integer[] arr = {15, 3, 9, 25, 18, 7, 30, 2, 14, 5, 11, 27, 6, 20, 8, 12, 1, 17, 4, 23};
        System.out.println();
        //Given aray is
        PrintArray(arr, "Initial");
        int firstIndex=0;
        int lastIndex=arr.length-1;
        quickSort(arr,firstIndex,lastIndex);
        PrintArray(arr,"Final");

    }


    static void quickSort(Integer[] arr, int firstIndex, int lastIndex) {
        // Check if the first index is less than the last index
        if (firstIndex < lastIndex) {
            // Find the partition index, which separates the array into two halves
            int partitionIndex = partition(arr, firstIndex, lastIndex);
            // Recursively apply quickSort to the left sub-array
            quickSort(arr, firstIndex, partitionIndex - 1);
            // Recursively apply quickSort to the right sub-array
            quickSort(arr, partitionIndex + 1, lastIndex);
        }
    }

    static int partition(Integer[] arr, int firstIndex, int lastIndex) {
        // Choose the first element as the pivot
        int pivot = arr[firstIndex];
        // Initialize pointers for partitioning
        int i = firstIndex; // Pointer for the smaller element
        int j = lastIndex;  // Pointer for the larger element

        // Loop to rearrange elements based on the pivot
        while (i < j) {
            // Move i forward until an element greater than the pivot is found
            while (arr[i] <= pivot && i <= lastIndex - 1) {
                i++;
            }
            // Move j backward until an element less than or equal to the pivot is found
            while (arr[j] > pivot && j >= firstIndex + 1) {
                j--;
            }
            // Swap elements if i is still less than j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at the j pointer
        int sTemp = arr[firstIndex];
        arr[firstIndex] = arr[j];
        arr[j] = sTemp;

        // Return the partition index where the pivot is now located
        return j;
    }


    static void PrintArray(Integer[] arr, String state) {

        System.out.print("The " + state + " array is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
