package org.functional.Search.BinarySearch;

public class Find_nth_root_of_m {
    public static void main(String[] args) {
        System.out.println(" You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.");

        int n = 1, m = 14;
        System.out.println("Using Iterative method => "+solution_Iterative(n,m));
        System.out.println("Using binary search =>  " + solution_BinarySearch( n , m));


    }

    static  int solution_Iterative(int n,int m){
        for(int i=0;i<=m;i++){
            if(calculatePower( i,  n) == m){
                return i;
            }
        }
        return -1;
    }

    static int solution_BinarySearch(int n , int m){

        int left = 1;
        int right = m;

        while(left<=right){
            int mid = (left+right)/2;

            if(calculatePower(mid,n) == m){
                return mid;
            }else if(calculatePower(mid,n) < m){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }


    public static int calculatePower(int n, int m) {
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n; // Multiply n, m times
        }
        return result;
    }
}
