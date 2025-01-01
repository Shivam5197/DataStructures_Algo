package org.functional.Search.TWODIM_OR_MATRIX_QUESTIONS;

import org.functional.TerminalColors;

public class Search_a_2D_Matrix {
    public static void main(String[] args) {

        int arr[][] =   {{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};

        int num = 30;

        System.out.println(TerminalColors.RED +"Given a 2D integer matrix mat[][] of size n x m, where every row and column is sorted in increasing order and a number x, the task is to find whether element x is present in the matrix.");

        System.out.println(TerminalColors.CYAN+" Linear Search solution => " + linearSolution(arr,num));
        System.out.println(TerminalColors.GREEN+" Binary Search solution => " + BinarySolution(arr,num));

    }

    private static boolean linearSolution(int[][] arr, int num) {

        int rows = arr.length;
        int col = arr[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(num == arr[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean BinarySolution(int[][] arr, int num) {
        int rows = arr.length;
        int col = arr[0].length;

        for(int i=0;i<rows;i++){
            boolean isFound =   binSear(arr[i] , num);
                if(isFound){
                    return true;
                }
        }
        return false;
    }

    private static boolean binSear(int[] arr, int num) {
        PrintArray(arr);
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (right+left)/2;
            if(arr[mid] == num){
                return true;
            }else if( arr[mid] <= num){
                left = mid+1;
            }else{
                right = mid-1;

            }
        }
        return false;
    }

    public static void PrintArray(int[] arr ) {

        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

}
