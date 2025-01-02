package org.functional.Search.TWODIM_OR_MATRIX_QUESTIONS;

import org.functional.TerminalColors;

import java.util.Arrays;

public class Find_Peak_Element_2DMatrix {

    public static void main(String[] args) {
        System.out.println(TerminalColors.RED +"Question => A peak element in a 2D grid is an element that is strictly greater than all of its adjacent neighbors to the left, right, top, and bottom.\n" +
                "Given a 0-indexed m x n matrix mat where no two adjacent cells are equal, find any peak element mat[i][j] and return the length 2 array [i,j].\n" +
                "You may assume that the entire matrix is surrounded by an outer perimeter with the value -1 in each cell.\n" +
                "You must write an algorithm that runs in O(m log(n)) or O(n log(m)) time.");

//        int[][] arr = {
//                {10, 20, 15},
//                {21, 30, 14},
//                {7, 16, 32}
//        };
        int[][] arr = {
                {1,4},
                {3,2}
        };

        System.out.println(" The solution with jugad => "+ Arrays.toString(jugaduSolution(arr)));
    }

    static int[] jugaduSolution(int arr[][]){
        int ar[] = new int [2];

        int row = arr.length;
        int column = arr[0].length;
        int max = arr[0][0];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){

                if(max < arr[i][j]) {
                    max = arr[i][j];
                    System.out.println("value of max => " + max);

                    System.out.println("value of arr => " + arr[i][j]);
                    ar[0] = i;
                    ar[1] = j;
                }
            }
        }
        return ar;
    }

}
