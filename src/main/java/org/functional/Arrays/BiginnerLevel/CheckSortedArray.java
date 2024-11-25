package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;

public class CheckSortedArray {
    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 8, 10};
        checkSortedArray(arr);
    }

    static void checkSortedArray(Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "Check if an Array is Sorted:");

        boolean sorted1 = false;
        boolean sorted2 = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted1 = false;
                break;
            } else {
                sorted1 = true;
            }
        }
        if (sorted1) {
            System.out.println(TerminalColors.CYAN + "The array {2, 4, 6, 8, 10} is Sorted");

        } else {
            System.out.println(TerminalColors.CYAN + "The array {2, 4, 6, 8, 10} is Not Sorted");
        }
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();
    }

}
