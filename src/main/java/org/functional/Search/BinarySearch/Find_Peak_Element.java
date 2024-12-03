package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Find_Peak_Element {

    public static void main(String[] args) {
        System.out.println(TerminalColors.RED +"A peak element is an element that is strictly greater than its neighbors.\n" +
                "\n" +
                "Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.");

        int [] arr = {1,2,1,3,5,6,4};

        System.out.println("Iterative way = > " + findPeakElement_Iterative(arr));
        System.out.println("Binary way = > " + findPeakElement_BinarySearch(arr));
    }


    public static int findPeakElement_Iterative(int[] arr) {
        int n = arr.length;
        int g = -1;
        if(arr.length ==1 ){
            return arr[0];
        }
        for(int i=0;i<arr.length-1;i++){
            if(i == 0){
                if(arr[i] > arr[i+1]){
                    g = i;
                }
            } else if (i  == arr.length-1) {
                if(arr[i] > arr[i-1]){
                    g = i;
                }
            } else {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    g =  i;
                }
            }
        }
        return g;
    }

    public static int findPeakElement_BinarySearch(int arr[] ){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        if(n == 1){ // Size of array is 1
            return 0;
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if(arr[n-1] > arr[n-2]){//checking the last two elements
            return n-1;
        }
        while(left <= right){
            int mid = (left+right)/2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }
            // Move left if the left neighbor is greater
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            }
            // Otherwise, move right
            else {
                left = mid + 1;
            }
        }
        return -1;
    }



}
