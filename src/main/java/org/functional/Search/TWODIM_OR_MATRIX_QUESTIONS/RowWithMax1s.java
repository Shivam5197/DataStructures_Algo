package org.functional.Search.TWODIM_OR_MATRIX_QUESTIONS;

import org.functional.TerminalColors;

public class RowWithMax1s {

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.println(TerminalColors.RED +"You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1. ");

        System.out.println(TerminalColors.CYAN+"Linear Search Solution => " + linearSearch(arr));
        System.out.println(TerminalColors.GREEN+"Binary Search Solution => " + BinarySolution(arr));

    }

    static int linearSearch(int arr[][]){
        int index = -1;
        int max_count = -1;
        int rows = arr.length;
        int columns = arr[0].length;

        for(int i=0;i<rows;i++){
            int curntCount = 0;
            for(int j=0;j<columns;j++){
                curntCount += arr[i][j];
            }
        if(curntCount > max_count){
            max_count = curntCount;
            index = i;
            }
        }
        return index;
    }

    static int BinarySolution(int arr[][]){
        int index = -1;
        int max_count = 0;
        int rows = arr.length;
        int columns = arr[0].length;

        for(int i=0;i<rows;i++){
            int currntCount = columns - lowerBound(arr[i],1);
            if(currntCount>max_count){
                max_count = currntCount;
                index =i;
            }
        }
        return index;
    }



//    k = the number to find

static int lowerBound(int[] arr, int k) {
    int left =0;
    int right = arr.length-1;
    int lower_Bound = arr.length;  // hypothetical index if Lower_bound not found
    while(left <= right){
        int mid = (left+right)/2;
        if(arr[mid] >= k){
            lower_Bound = mid;
            right = mid-1;
        }else {
            left = mid+1;
        }
    }
    return lower_Bound;
}
}