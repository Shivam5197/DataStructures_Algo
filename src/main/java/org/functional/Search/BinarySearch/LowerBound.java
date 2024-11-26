package org.functional.Search.BinarySearch;

public class LowerBound {

 //   What is Lower Bound?
 //   The lower bound algorithm finds the first or the smallest index in a sorted array where the value at that index is greater than or equal to a given key i.e. x.
 //   The lower bound is the smallest index, ind, where arr[ind] >= x. But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        int k = 78;
        System.out.println("The lower bound of k = " + k + "  is => " + lowerBound(arr, k));

    }

    static int lowerBound(int[] arr, int k) {

        int left =0;
        int right = arr.length-1;
        int lower_Bound = arr.length;  // hypothetical index if Lower_bound not found
        while(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] >= k){
                lower_Bound = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return lower_Bound;
    }
}
