package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;

public class Allocate_Books_Important {

    public static void main(String[] args) {

        int arr[] = {12, 34, 67, 90};
        int students = 2;

        System.out.println(TerminalColors.GREEN+" Linear Search => " + LinearSolution(arr,students));

    }

    static int BinarySolution(int arr[],int students){

        if(arr.length<students){
            return -1;
        }

        int left = findMax(arr);
        int right = findSum(arr);
        while(left <= right ){
            int mid = (left+right)/2;
            int stuCount = stundetCountFun(arr,mid);
            if(stuCount > students ){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
    return left;
    }

        static int LinearSolution(int arr[] , int students){
            if(arr.length<students){
                return -1;
            }
            int max = findMax(arr);
            int sum = findSum(arr);

            for(int i=max;i<=sum;i++){
                int stuCount = stundetCountFun(arr,i);
                if(stuCount <= students){
                    return i;
                }
            }
            return -1;
        }

    private static int stundetCountFun(int[] arr, int pages) {

        int students = 1;
        int pagesStudent =0;

        for(int i=0;i<arr.length;i++){
            if(pagesStudent + arr[i] <= pages){
                pagesStudent += arr[i];
            }else{
                students++;
                pagesStudent = arr[i];
            }
        }

        return students;
    }


    /**
     * Finds the maximum value in the array.
     *
     * @param arr  Array of integers.
     * @return     Maximum value in the array.
     */
    static int findMax(int arr[]) {
        int max = arr[0];  // Initialize with the first element
        for (int i = 0; i < arr.length; i++) {
            max = Integer.max(max, arr[i]);  // Update max if a larger value is found
        }
        return max;
    }


    /**
     * Finds the sum of the array.
     *
     * @param arr  Array of integers.
     * @return     Maximum value in the array.
     */
    static int findSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
