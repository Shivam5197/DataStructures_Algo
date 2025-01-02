package org.functional.Search.TWODIM_OR_MATRIX_QUESTIONS;

import org.functional.TerminalColors;

import java.util.Arrays;

public class Median_in_a_row_wise_sorted_Matrix {

    public static void main(String[] args) {
        System.out.println(TerminalColors.RED +"Question =>  Given a row-wise sorted matrix where the number of rows and columns is always odd, find the median of the matrix." );

        int[][] arr = {
                {1, 3, 5},
                {2, 6, 9},
                {3, 6, 9}
        };

        System.out.println(TerminalColors.CYAN+" Median for the given 2D Array is => " + linearSearch(arr));

    }

    static int linearSearch(int arr[][]){
        int mid =-1;
        int rows = arr.length;
        int columns = arr[0].length;
        int ar[] = new int[rows*columns];
        int num =0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                ar[num] = arr[i][j];
                num++;
            }
        }
        Arrays.sort(ar);
        PrintArray(ar);
        mid = ar.length/2;
        return ar[mid];
    }

    public static void PrintArray(int[] arr ) {

        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

}
