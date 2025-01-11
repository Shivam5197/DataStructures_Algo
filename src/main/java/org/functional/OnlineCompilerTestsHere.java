package org.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnlineCompilerTestsHere {

    public static void main(String[] args) {
        String str =  "vbupfqqgnaevilznuaxtqlitkfxnxbv";
//        System.out.println( "Second Largest is =>   "+secondLargest());
//        List<String> names = Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks");

        System.out.println(fakePRofile(str));

     //   System.out.println("Remove Dupicates is = > " + remove_duplicate());
    }

    public static  String  fakePRofile(String a)
    {
        //code here
        System.out.println(a.length());
        int count=0;
        for(int i=0;i<a.length();i++){
            if ( a.charAt(i) != 'a' && a.charAt(i) != 'e'
                    && a.charAt(i) != 'i'  && a.charAt(i) != 'o'  && a.charAt(i) != 'u'   ){
                count++;
            }
        }
        System.out.println(
                count
        );
        if(count % 2 !=0){
            return "HE!";
        }else{
            return "SHE!";
        }

    }
    
    
    public static String Sandwiched_Vowel(String str)
    {
        // Complete function
        StringBuilder st = new StringBuilder();

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u' ){

                st.append(str.charAt(i));
            }
        }
        return st.toString();
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


    public static String longest(List<String> names) {
        // code here
        int size =names.get(0).length();
        String str = "";
        StringBuilder st = new StringBuilder();
        for(int i =0 ;i < names.size();i++){
            if(names.get(i).length() > str.length()){
                str = names.get(i);
            }

        }
        return str;
    }

}
