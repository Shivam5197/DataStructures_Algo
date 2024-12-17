package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Capacity_To_Ship_Packages_Within_D_Days {

    public static void main(String[] args) {
        System.out.println( TerminalColors.RED +"Given an array arr[] of n weights. Find the least weight capacity of a boat to ship all weights within d days.\n" +
                "The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].We may not load more weight than the maximum weight capacity of the ship.\n" +
                "\n" +
                "Note: You have to load weights on the boat in the given order.");
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(" Capacity is => " + linerSolution(arr,days));
        System.out.println(" Capacity is => " + BinarySolution(arr,days));

    }

    static int linerSolution(int arr[] , int days){
//      int capacity = 0;
        int max = findMaxInArray(arr);
        int sum = findSumOfArray(arr);
        for(int i=max;i<sum;i++){
            int daysRequired = findDays(arr,i);
            if(daysRequired <= days){
                return i;
            }
        }
        return -1;
    }


    static int BinarySolution(int arr[] , int days){

        int left = findMaxInArray(arr);
        int right = findSumOfArray(arr);
        while(left <= right){
            int mid = (left+right)/2;
            int capacity = findDays(arr , mid);
            if(capacity <= days){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
    return left;
    }

    static int findDays(int weight[] , int capacity){
        int days =1 ;
        int load = 0;
        for(int i=0;i<weight.length;i++){
            if(load + weight[i] > capacity){
                days = days+1;
                load = weight[i];
            }else{
                load += weight[i];
            }
        }
return days;
    }

   static int findMaxInArray(int arr[]){
            int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static  int findSumOfArray(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

}
