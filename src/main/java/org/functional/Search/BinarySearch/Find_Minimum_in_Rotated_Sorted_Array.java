package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

import java.util.ArrayList;

public class Find_Minimum_in_Rotated_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 1, 2};
        int k = 3;
        System.out.println( TerminalColors.GREEN+ " Iterative way and found min => " + findMinIterativeWay(arr));
        System.out.println( TerminalColors.RED+ " Binary search way and found min =>  " + findMinUsingBinarySearch(arr));
    }

    public static int findMinIterativeWay(int[] arr) { // O(n) time complexity
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int findMinUsingBinarySearch(int[] arr) { // O(n) time complexity
        // O(n) time complexity
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left+right)/2;

            // If the array is sorted between left and right, return the smallest value
            if (arr[left] <= arr[right]) {
                min = Math.min(min, arr[left]);
                break;
            }

            if(arr[left] <= arr[mid] ){//left is sorted
                min = Math.min(min,arr[left]);
                left = mid+1;

            }else{
                min = Math.min(min,arr[mid]);
                right = mid-1;

            }
        }
        return min;
    }


}
