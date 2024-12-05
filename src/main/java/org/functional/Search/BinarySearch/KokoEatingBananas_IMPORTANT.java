package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class KokoEatingBananas_IMPORTANT {

    public static void main(String[] args) {
        System.out.println("Given an array arr[] of integers where each element represents a pile of bananas, and Koko has k hours to finish all the piles, find the minimum number of bananas (s) \n" +
                " Koko must eat per hour to finish all the bananas within k hours. Each hour, Koko chooses a pile and eats s bananas from it.\n" +
                " If the pile has fewer than s bananas, she consumes the entire pile for that hour and won't eat any other banana during that hour.");

//        Input: arr[] = [3, 6, 7, 11] , k = 8
//        Output: 4
//        Explanation: Koko eats at least 4 bananas per hour to finish all piles within 8 hours, as she can consume each pile in 1 + 2 + 2 + 3 = 8 hours.

        int arr[]= {30, 11, 23, 4, 20};
        int limit = 5;

        System.out.println();
        System.out.println(TerminalColors.RED +" Koko should eat " +solutionIterative(arr,limit)+ " bananas per hour ! as per iterative way ");
        System.out.println(TerminalColors.BLUE +" Koko should eat " +solutionBinary(arr,limit)+ " bananas per hour ! as per Binary way ");

    }

    static int solutionIterative(int arr[] , int limit){
        int maximum = findMax(arr);
        int hourlySpeed = 0;
        for(int i=1;i<=maximum;i++){
            hourlySpeed = countHourlySpeed(arr,i);
            if(hourlySpeed <= limit){
                return i;
            }
        }
    return -1;
    }

    static int solutionBinary(int arr[] , int limit){
        int left =0;
        int right = findMax(arr);
        int ans= Integer.MAX_VALUE;

        while(left <= right){
            int mid = (left+right)/2;

            int totalHours = countHourlySpeed(arr,mid);

            if(totalHours <= limit){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;
    }




    static int countHourlySpeed(int arr[] , int hourly ){
        int n = arr.length;
        int totalHours = 0;
        for(int i=0;i<arr.length;i++) {
            totalHours += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalHours;
    }

    static int findMax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
