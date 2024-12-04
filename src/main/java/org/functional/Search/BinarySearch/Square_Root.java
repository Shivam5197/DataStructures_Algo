package org.functional.Search.BinarySearch;

public class Square_Root {
    public static void main(String[] args) {
        System.out.println(" Given an integer n, find the square root of n. If n is not a perfect square, then return the floor value.\n" +
                "\n" +
                "Floor value of any number is the greatest Integer which is less than or equal to that number");

        int n = 2147483647;
        System.out.println( n+" is the square root of Linear Search => " + floorSqrt_LinearSearch(n));
        System.out.println( n+" is the square root of Binary Search=> " + floorSqrt_Binary(n));

    }

    static    int floorSqrt_LinearSearch(int n) {
        // Your code here
        int num = Integer.MIN_VALUE;

        for(int i=1;i<n;i++){
            if(i * i == n) {
               return i;
            }else if(i * i > n){
                return i-1;
            }
        }
        return -1;
    }

    static int floorSqrt_Binary(int n){

        int left =1;
        int right = n;
        int ans = 0;

        while(left <= right){
            int mid = (left+right)/2;
            int value = mid * mid;
        if (value <= n){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return right;
    }


}
