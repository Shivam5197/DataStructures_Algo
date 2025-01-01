package org.functional.Search.BinarySearch;

public class Split_Array_Largest_Sum {

    public static void main(String[] args) {
        System.out.println("Books allocation same problem same code same approach !!");

        int arr[] = {1,2,3,4,5,7,8};
        int n = arr.length;

        int actualSum = (n*n)/2;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // Check if the missing number is in the left half
            if (arr[mid] != arr[0] + mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // The missing number is array[0] + start
        System.out.println("Missing number is => " + (arr[0] + start));
    }



}
