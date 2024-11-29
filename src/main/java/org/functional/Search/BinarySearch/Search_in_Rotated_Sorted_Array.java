package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int k = 3;
        System.out.println("The index where k=" + k + " is located is =>   " + new Search_in_Rotated_Sorted_Array().searchByIterator(arr, k));
        System.out.println( TerminalColors.GREEN+ " Binary search The index where k=" + k + " is located is =>   " + searchByBinary(arr, k));
        System.out.println( TerminalColors.RED+ " Striver Binary search The index where k=" + k + " is located is =>   " + striverSolBinary(arr, k));

    }

    public int searchByIterator(int[] arr, int target) {
        for (int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int searchByBinary(int [] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                return mid;
            }else if (target < arr[mid]){

                right = right+1;
            }else{
                left = left-1;
            }
        }
        return -1;
    }

    public static int striverSolBinary(int[] arr, int k){

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == k){
                return mid;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= k &&  k <= arr[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }else{
                if(arr[mid] <= k &&  k <= arr[right]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return -1;
    }


}
