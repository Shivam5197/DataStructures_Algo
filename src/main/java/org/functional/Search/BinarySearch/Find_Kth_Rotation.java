package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Find_Kth_Rotation {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Given an increasing sorted rotated array arr of distinct integers.");
        System.out.println("The array is right-rotated k times. Find the value of k.");
        System.out.println("Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times it will look like this:");
        System.out.println("After 1st Rotation : [9, 2, 4, 6]");
        System.out.println("After 2nd Rotation : [6, 9, 2, 4]");

        int[] arr = {5, 1, 2, 3, 4};

        System.out.println(TerminalColors.BLUE +" The number of rotations the given array has => "+        findRotationNumber(arr));
    }


    public static int findRotationNumber(int arr[]){

        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = arr.length-1;
        int index = -1;
        while(left <= right){
            int mid = (left+right)/2;

            // If the array is sorted between left and right, return the smallest value
            if (arr[left] <= arr[right]) {
                if(min<arr[left]){
                    index = left;
                    min = arr[left];
                }
                break;
            }

            if(arr[left] <= arr[mid] ){//left is sorted
                if(min>arr[left]){
                    index = left;
                    min = arr[left];
                }

                left = mid+1;

            }else{
                if(min>arr[mid]){
                    index = mid;
                    min = arr[mid];
                }
                right = mid-1;

            }
        }
        return index;
    }


}
