package org.functional.Search.BinarySearch;

public class SearchIndex {

    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int k = 5;

        System.out.println("The index where it should be is => " + searchInsert(arr,k));
    }

    public static int searchInsert(int[] arr, int x) {
        int n = arr.length;
        int left = 0;

        int right = n-1;

        int lb = n;

        while(left <= right){

            int mid = (left+right)/2;

            if(arr[mid] > x){
                lb = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return lb;
    }
}
