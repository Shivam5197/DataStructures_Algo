package org.functional.Search.BinarySearch;

import org.functional.FunctionalInterface._Consumer;
import org.functional.TerminalColors;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static void main(String[] args) {
        System.out.println(TerminalColors.RED+" Question => " + TerminalColors.BLACK +" Given an array of integers nums and an integer threshold, we will choose a positive integer divisor, divide all the array by it, and sum the division's result." +
                "\n Find the smallest divisor such that the result mentioned above is less than or equal to threshold." +
                "\n" +
                "Each result of the division is rounded to the nearest integer greater than or equal to that element. (For example: 7/3 = 3 and 10/2 = 5)." +
                "\n" +
                "The test cases are generated so that there will be an answer.");

        int arr[] = {1,2,5,9};
        int threshold =6;

        System.out.println(TerminalColors.BLUE+""+solutionIterative(arr,threshold));
        System.out.println(TerminalColors.GREEN+""+binarySolution(arr,threshold));

    }


    static int binarySolution(int arr[] , int threshold){

        int left = 0;
        int right = findMax(arr);
        int sum =0;

        while(left <= right){
            int mid = (left+right)/2;

            if(sumByD(arr,mid) <= threshold){
                right = mid-1;
            }else{
                left = mid+1;
            }
            return left;
        }
        return -1;
    }

    static int sumByD(int arr[] , int value){

        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += Math.ceil((double)(arr[i]) / (double)(value));
        }
        return sum;
    }


    static int solutionIterative(int arr[] , int threshold ){
        int num = 0;
        int max = findMax(arr);
        for(int d=1;d<=max;d++){
          int  sum =0;
            for(int i=0;i<arr.length;i++){
                sum += Math.ceil((double)(arr[i]) / (double)(d));
                System.out.println("value of d " + d + " value of i " + i + " value of sum " + sum);
            }
                if(sum <= threshold){
                    return d;
                }
        }
        return -1;
    }

    static int findMax(int arr[]){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
