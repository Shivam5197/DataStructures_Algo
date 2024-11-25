package org.functional.Arrays.BiginnerLevel;

import java.util.Arrays;
import java.util.Optional;
import org.functional.TerminalColors;

public class printMaximumAndMinimumOfArrayQuestion {

    public static void main(String[] args) {

        Integer[] arr  = {3, 5, 1, 8, 2, 9, 4};
        printMaximumAndMinimumOfArrayQuestion1(arr);
        solUsingStreams(arr);

    }

    static void printMaximumAndMinimumOfArrayQuestion1(Integer[] arr) {
        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println(TerminalColors.BLUE + "This is Question 1 for Find the Maximum and Minimum Element:");

//        PrintArray(arr,1);
        Integer max = 0;
        Integer min = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(TerminalColors.CYAN + "Maximum value is : = " + max + " & Minimum value is = " + min);
    }

    static void solUsingStreams(Integer[] arr){
        //Solution using Streams

        Optional<Integer> maxStream = Arrays.stream(arr).max(Integer::compare);
        Optional<Integer> minStream = Arrays.stream(arr).min(Integer::compare);

        System.out.println(TerminalColors.MAGENTA + "Solution using Streams  = > Maximum value is : = " + maxStream + " & Minimum value is = " + minStream);

        System.out.println(TerminalColors.WHITE + "************************************************************************");
        System.out.println();
    }


}
