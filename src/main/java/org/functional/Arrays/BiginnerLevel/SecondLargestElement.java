package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;


public class SecondLargestElement {

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 8, 2, 9, 4};
            secondLargestElement(arr);
            optimizedSecondLargest(arr);
    }

    static void secondLargestElement( Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "Find the Second Largest Element:");


        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > secondMax && arr[i] < max)
                secondMax = arr[i];

        }
        System.out.println(TerminalColors.CYAN + "Second Maximum is -> " + secondMax);

    }

    static void optimizedSecondLargest( Integer[] arr){
        //optimized way

        int maximum = arr[0];
        int secondMaximum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maximum) {
                // Update secondMax before max
                secondMaximum = maximum;
                maximum = arr[i];
            } else if (arr[i] > secondMaximum && arr[i] != maximum) {
                // Update secondMax if arr[i] is less than max
                secondMaximum = arr[i];
            }
        }
        System.out.println(TerminalColors.CYAN + " Optimized Second Maximum is -> " + secondMaximum);
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();

    }

}
