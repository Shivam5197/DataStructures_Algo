package org.functional;

import java.util.ArrayList;
import java.util.List;

public class OnlineCompilerTestsHere {

    public static void main(String[] args) {

//        System.out.println( "Second Largest is =>   "+secondLargest());

        System.out.println("Remove Dupicates is = > " + remove_duplicate());
    }



    static int secondLargest(){

        Integer[] arr = {10, 5, 10};
        int max=0;
        int secondMax=0;
        if(arr[0] == arr[1]){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max= arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] > secondMax && arr[i] < max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    static  int remove_duplicate() {
        // Code Here
        List<Integer> numbers = new ArrayList<>();

        // Add the numbers to the list
        numbers.add(32);
        numbers.add(40);
        numbers.add(43);
        numbers.add(60);
        numbers.add(72);
        numbers.add(78);
        numbers.add(82);
        numbers.add(82);
        numbers.add(82);
        numbers.add(99);

        List<Integer> newint = new ArrayList<>();
        int first = 0;
        newint.add(numbers.get(0));
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(first) != numbers.get(i)){
                newint.add(numbers.get(i));
                first++;
            }
        }
        System.out.println("new INT is :> " + newint.toString() );
        System.out.println("Correct output is => " + "32 40 43 60 72 78 82 99");
        return newint.size();
    }


}
