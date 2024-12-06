package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Minimum_days_to_make_M_bouquets {
    public static void main(String[] args) {
        System.out.println( TerminalColors.RED +" Question => "+ TerminalColors.BLACK +"You have a row of flowers, where each flower blooms after a specific day. The array arr represents the blooming schedule: arr[i] is the day the flower at \n" +
                "position i will bloom. To create a bouquet, you need to collect k adjacent bloomed flowers. Each flower can only be used in one bouquet." +
                "\n" +
                "Your goal is to find the minimum number of days required to make exactly m bouquets. If it is not possible to make m bouquets with the given arrangement, return -1.");
        int arr[] = {5, 5, 5, 12, 10, 5, 5};
        int requiredBouquet = 2;
        int numberOfAdjacentFlowers = 3;

        System.out.println(TerminalColors.GREEN+"Days required for making the bouquet by iterating are => " + solutionIterative(arr,requiredBouquet,numberOfAdjacentFlowers));
        System.out.println(TerminalColors.GREEN+"Days required for making the bouquet by iterating are => " + solutionBinarySearch(arr,requiredBouquet,numberOfAdjacentFlowers));

    }


    static int solutionBinarySearch(int arr[] , int requiredBouquet, int numberOfAdjacentFlowers){
        int right= findMax(arr);
        int left = findmin(arr);
        int ans =0;
        if(arr.length< (requiredBouquet*numberOfAdjacentFlowers)){
            return -1;
        }
        while(left <= right){
            int mid = (left+right)/2;
            if(possibleToMakeBouquet(arr,mid,requiredBouquet,numberOfAdjacentFlowers)){
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return left;
    }




    static int solutionIterative(int arr[] , int requiredBouquet, int numberOfAdjacentFlowers){
        int max= findMax(arr);
        int min = findmin(arr);
        System.out.println(TerminalColors.YELLOW+"Maximum => " + max+ " Minimum => " + min);
        if(arr.length< (requiredBouquet*numberOfAdjacentFlowers)){
            return -1;
        }
        for(int i = min; i<=max;i++){
            if(possibleToMakeBouquet(arr,i,requiredBouquet,numberOfAdjacentFlowers)){
                return i;
            }
        }
        return -1;
    }

    static boolean possibleToMakeBouquet(int arr[] , int day ,int requiredBouquet, int numberOfAdjacentFlowers){

        int count = 0;
        int numberOfBouquet=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] <= day){
                count++;
            }else{
                numberOfBouquet += (count / numberOfAdjacentFlowers);
                count=0;
            }
        }
        numberOfBouquet += (count / numberOfAdjacentFlowers);
        if(requiredBouquet <= numberOfBouquet){
            return true;
        }else{
            return false;
        }
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

    static int findmin(int arr[]){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


}
