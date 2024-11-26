package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;
import org.functional.utils.Utils;

public class MergeTwoArrays {

    public static void main(String[] args) {
        Integer[] arr = {1, 3, 5};
        Integer[] arr1 = {2, 4, 6};

    }


    static void mergeTwoArrays( Integer[] arr,Integer[] arr1) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "Merge Two Arrays");
        Integer[] arr2 = new Integer[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int j = 0; j < arr1.length; j++) {
            arr2[arr.length + j] = arr1[j];
        }
        //Now we got the values not let's sort this array
//        {4,8,7}
        int temp = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 1; j < arr2.length - i; j++) {
                if (arr2[j] < arr2[j - 1]) {
                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        Utils.PrintArray(arr2, TerminalColors.BLUE);

        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();
    }

}
