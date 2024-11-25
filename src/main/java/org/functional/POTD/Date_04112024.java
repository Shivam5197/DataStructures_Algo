package org.functional.POTD;

import java.util.ArrayList;
import java.util.List;

public class Date_04112024 {

    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {

        System.out.println(RED+" Question: Find All Triplets with Zero Sum");
        List<List<Integer>> response = new ArrayList<>();

        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        for(int i =0;i< n ; i++){
            for(int j=i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){

                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> smallList = new ArrayList<>();
                        smallList.add(i);
                        smallList.add(j);
                        smallList.add(k);
                        response.add(smallList);
                    }
                }
            }
        }

//        response.add(smallList);
        System.out.println(response);


    }



}
