package org.functional.Search.BinarySearch;

import org.functional.TerminalColors;
import org.functional.utils.Utils;

import java.awt.*;
import java.util.ArrayList;

public class FirstAndLastElementIndexInSorted {

    public static void main(String[] args) {
        System.out.println("Find First and Last Position of Element in Sorted Array !");

        int arr[] = {5,7,7,8,8,10};
        int target = 6;

        searchRangeIterativeWay(arr,target);
        binarySearchWay(arr,target);
    }

    public static void searchRangeIterativeWay(int[] arr, int target) {

        int first = -1;
        int last = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                if(first == -1){
                    first = i;
                }
                last = i;
            }
        }
        ArrayList<Integer> innerList1 = new ArrayList<>();
        innerList1.add(first);
        innerList1.add(last);
        System.out.println(TerminalColors.BLUE+"First is => " + first + " last => "+ last);
    }

    public static void binarySearchWay(int arr[] , int target){

        int lb =   LowerBound.lowerBound(arr,target);
        int ub = UpperBound.upperBound(arr,target,arr.length);

        System.out.println("Values of LB => " + lb + " vaklue of ub => " + ub);
        if(lb == arr.length || arr[lb] != target){
            System.out.println(" Element not found in the array so First and Last indexes will be " + -1 +" & " + -1);
        }
        System.out.println(" Elements found and first index is => " + lb +" & last index is  " + (ub-1));

    }




}
