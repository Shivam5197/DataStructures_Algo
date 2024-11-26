package org.functional.Arrays.BiginnerLevel;

import org.functional.TerminalColors;

import java.util.Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {

        Integer[] arr = {2, 4, 6, 8, 10};

        sumOfElementsInArray(arr);
        sumUsingStreams(arr);

    }

    static void sumOfElementsInArray(Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "Sum of Array Elements");

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(TerminalColors.CYAN + " The sum of Provided array is => " + TerminalColors.YELLOW + "" + sum);
        System.out.println(TerminalColors.MAGENTA + "Streams Way to do it ");
    }

    static void sumUsingStreams(Integer[] arr){
        int sum2 = Arrays.stream(arr).mapToInt(Integer::intValue).sum();
        System.out.println(TerminalColors.MAGENTA + " The sum of Provided array using streams is => " + TerminalColors.YELLOW + "" + sum2);
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();

    }


}
