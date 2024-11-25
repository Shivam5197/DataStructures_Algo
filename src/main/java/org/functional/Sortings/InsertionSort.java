package org.functional.Sortings;

public class InsertionSort {

    public static void main(String[] args) {

        Integer[] arr = {25, 12, 37, 6, 11, 30, 17, 22, 49, 9, 4};

        insertionSort(arr);

    }
//    Approach
//    Select an element in each iteration from the unsorted array(using a loop).
//    Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
//    The “inner while loop” basically shifts the elements using swapping.

    static void insertionSort(Integer[] arr){
        System.out.println("===========================================================");
        PrintArray(arr,"Initial Function");

        for (int i = 0; i < arr.length; i++) { // i represents the current index to be placed in the sorted portion
            int j = i; // j is used to traverse back through the sorted portion of the array
            while (j > 0 && arr[j - 1] > arr[j]) { // Check if the element at j-1 is greater than the current element
                // If true, a swap is needed to move the current element leftwards in the sorted section
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--; // Decrement j to continue checking previous elements in the sorted portion
            }
        }// This loop ensures that the array is sorted from left to right incrementally
        PrintArray(arr,"Final ");
    }


    static void PrintArray(Integer[] arr, String state) {

        System.out.print("The " + state + " array is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

}
