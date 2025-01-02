package org.functional.Search.TWODIM_OR_MATRIX_QUESTIONS;

import org.functional.TerminalColors;

public class Search_a_2D_Matrix_2 {

    public static void main(String[] args) {

        System.out.println(TerminalColors.RED+"Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:\n" +
                 "=> Integers in each row are sorted in ascending from left to right.\n" +
                "=> Integers in each column are sorted in ascending from top to bottom. ");

        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        int target = 7;
        boolean isFound = linearSearch(arr,target);
        if(isFound) {
            System.out.println(TerminalColors.CYAN + target + " found in the given matrix" + TerminalColors.GREEN + " using linear search !");
        } else {
            System.out.println(TerminalColors.CYAN + target + " not found in the given matrix" + TerminalColors.GREEN + " using linear search !");
        }

        boolean isFoundTwo = binarySearchtwo(arr,target);
        if(isFound) {
            System.out.println(TerminalColors.PURPLE + target + " found in the given matrix" + TerminalColors.GREEN + " using Binary search !");
        } else {
            System.out.println(TerminalColors.PURPLE + target + " not found in the given matrix" + TerminalColors.GREEN + " using Binary search !");
        }

    }

    static boolean linearSearch(int arr[][] , int target){
        int row = arr.length;
        int column = arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j] == target){
                    System.out.println(TerminalColors.YELLOW + target+" is found on index => ["+ i+"]["+j+"]");
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean binarySearchtwo(int[][] arr, int target) {

        return false;
    }



}
