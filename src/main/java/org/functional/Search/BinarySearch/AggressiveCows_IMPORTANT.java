package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

import java.util.Arrays;

public class AggressiveCows_IMPORTANT {

    public static void main(String[] args) {
        // Problem description
        System.out.println(TerminalColors.RED + "You are given an array 'arr' of size 'n' which denotes the position of stalls.\n" +
                "You are also given an integer 'k' which denotes the number of aggressive cows.\n" +
                "You are given the task of assigning stalls to 'k' cows such that the minimum distance between any two of them is the maximum possible.\n" +
                "Find the maximum possible minimum distance.");

        // Number of cows to be placed
        int countOfCows = 4;

        // Array of stall positions
        int arr[] = {0, 3, 4, 7, 10, 9};

        // Calculate and display the result using linear search solution
        System.out.println(TerminalColors.GREEN + "Maximum distance for the cows can be (Linear search solution) => " +
                TerminalColors.BLUE + "" + LinerSolution(arr, countOfCows));
        System.out.println(TerminalColors.GREEN + "Maximum distance for the cows can be (Binary search solution) => " +
                TerminalColors.BLUE + "" + BinarySolution(arr, countOfCows));

    }

    /**
     * Finds the maximum possible minimum distance using a linear search approach.
     *
     * @param arr          Array of stall positions.
     * @param countOfCows  Number of cows to be placed.
     * @return             Maximum possible minimum distance or -1 if not possible.
     */
    static int LinerSolution(int arr[], int countOfCows) {
        // Sort the stall positions to ensure they are in increasing order
        Arrays.sort(arr);

        // Find the range of possible distances
        int max = findMax(arr);  // Maximum position
        int min = findMin(arr);  // Minimum position

        // Iterate through possible distances linearly
        for (int i = 0; i < max - min; i++) {
            // Check if we can place cows with a distance of 'i'
            if (canWePlace(arr, i, countOfCows)) {
                continue;
            } else {
                // If cows can't be placed with distance 'i', return the previous distance
                return i - 1;
            }
        }
        return -1; // Return -1 if no valid distance is found
    }

    static int BinarySolution(int arr[], int countOfCows){
        Arrays.sort(arr);
        int left = 0;
        int right = arr[arr.length-1] - arr[0];

        while(left <= right){

            int mid = (left+right)/2;

            if(canWePlace(arr,mid,countOfCows) ){
                left = mid+1;
            }else{
                right = mid-1;
            }

        }
return right;
    }

    /**
     * Checks if cows can be placed in stalls with at least the given distance between them.
     *
     * @param arr          Array of stall positions.
     * @param distance     Minimum distance to maintain between cows.
     * @param countOfCows  Number of cows to place.
     * @return             True if cows can be placed, false otherwise.
     */
    private static boolean canWePlace(int[] arr, int distance, int countOfCows) {
        int numberOfCows = 1;  // Place the first cow at the first stall
        int lastPlaced = arr[0];  // Position of the last placed cow

        // Iterate through the stall positions
        for (int i = 0; i < arr.length; i++) {
            // Check if the current stall is far enough from the last placed cow
            if (arr[i] - lastPlaced >= distance) {
                numberOfCows++;  // Place another cow
                lastPlaced = arr[i];  // Update the position of the last placed cow
            }
        }

        // Return true if we were able to place all cows
        return numberOfCows >= countOfCows;
    }

    /**
     * Finds the maximum value in the array.
     *
     * @param arr  Array of integers.
     * @return     Maximum value in the array.
     */
    static int findMax(int arr[]) {
        int max = arr[0];  // Initialize with the first element
        for (int i = 0; i < arr.length; i++) {
            max = Integer.max(max, arr[i]);  // Update max if a larger value is found
        }
        return max;
    }

    /**
     * Finds the minimum value in the array.
     *
     * @param arr  Array of integers.
     * @return     Minimum value in the array.
     */
    static int findMin(int arr[]) {
        int min = arr[0];  // Initialize with the first element
        for (int i = 0; i < arr.length; i++) {
            min = Integer.min(min, arr[i]);  // Update min if a smaller value is found
        }
        return min;
    }
}
