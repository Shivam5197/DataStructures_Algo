package org.functional.Search.BinarySearch;

public class Single_Element_in_A_Sorted_Array {

    public static void main(String[] args) {
        System.out.println(" You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.");

        int arr[] = {1,1,2,3,3,4,4,8,8};

        System.out.println("Iterative way to get single element => "+singleElementIterative(arr));
        System.out.println("Binary way to get single element =>"+singleElementBinarySearch(arr));


    }

    public static int singleElementIterative(int arr[]){
        if(arr.length == 1){
            return arr[0];
        }
        for(int i=0;i<arr.length-1;i++){

            if(i == 0){
                if(arr[i] != arr[i+1]){
                    return arr[i];
                }
            } else if (i  == arr.length-1) {
                if(arr[i] != arr[i-1]){
                    return arr[i];
                }
            } else {
                if(arr[i] != arr[i-1] && arr[i] != arr[i+1]){
                    return  arr[i];
                }
            }
        }
        return -1;
    }


    public static int singleElementBinarySearch(int arr[] ){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        if(n == 1){ // Size of array is 1
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]){//checking the last two elements
            return arr[n-1];
        }
            while(left <= right){
                int mid = (left+right)/2;

                if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                    return arr[mid];
                }
                if(mid % 2 == 1 && arr[mid] == arr[mid-1] ||
                mid %2 == 0 && arr[mid] == arr[mid+1]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        return -1;
    }

}
