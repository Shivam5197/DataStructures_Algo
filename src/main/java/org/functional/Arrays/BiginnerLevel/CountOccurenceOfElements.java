package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;

public class CountOccurenceOfElements {


    public static void main(String[] args) {
        Integer[] arr = {2, 4, 6, 8, 10, 8};

        countOccurenceOfElements(arr);
    }

    static void countOccurenceOfElements( Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "Count Occurrences of an Element");

        int count = 0;
        int element = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                count++;
            }
        }
        System.out.println(TerminalColors.CYAN + " The count of Provided element " + element + " in array is => " + TerminalColors.YELLOW + "" + count);

        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();
    }
}
