package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;
import org.functional.utils.Utils;

import static org.functional.utils.Utils.PrintArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 8, 2, 9, 4};
        ReverseAnArray(arr);
    }

    static void ReverseAnArray(Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "This is Question 2 for Reverse an Array:");

        System.out.print(TerminalColors.CYAN + "Array Without Change is ");
        PrintArray(arr, TerminalColors.CYAN);
        System.out.println();
        Integer first = 0;
        Integer last = arr.length - 1;
        Integer temp = 0;
        while (first <= last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
        System.out.print("Array after Change is ");
        PrintArray(arr, TerminalColors.CYAN);

        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();
    }

}
