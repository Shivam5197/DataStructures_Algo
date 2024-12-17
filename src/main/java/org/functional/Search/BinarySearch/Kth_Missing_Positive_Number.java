package org.functional.Search.BinarySearch;

public class Kth_Missing_Positive_Number {

    public static void main(String[] args) {
    int arr[] = {2,3,4,7,11};
    int  k = 5;

        System.out.println("Missing positive integer is => " + linerSolution(arr,k));
    }

    static int linerSolution(int arr[] , int k){

        int ar[] = new int[findSumOfArray(arr)];
        for(int i= 0 ; i <arr.length;i++){

            if(arr[i] <= k){
                k++;
            }else{
                break;
            }

        }
        return k;
    }


    static int BinarySolution(int arr[] , int k){
return-1;
    }

    static  int findSumOfArray(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }


}