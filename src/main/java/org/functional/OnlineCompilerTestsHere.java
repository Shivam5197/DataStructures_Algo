package org.functional;

import java.util.*;

public class OnlineCompilerTestsHere {

    public static void main(String[] args) {
        String  str = "theskyisblue";

//        System.out.println( "Second Largest is =>   "+secondLargest());
//        List<String> names = Arrays.asList("Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks");
  //      String s = "abcd";
   //     String t = "abcde";
        int arr[] = {3,1,2};
        System.out.println(subsets(arr).toString());

     //   System.out.println("Remove Dupicates is = > " + remove_duplicate());
    }

    public static boolean checkSubsequenceSum(int N, int[] arr, int K) {
        // code here
        List<Integer> list = new ArrayList<>();

         checkList(list,N,arr,K,0);

        if(!list.isEmpty()){
            return true;
        }
        return false;
    }

    public static void checkList(List<Integer> list,int N, int[] arr, int K,int index){

        if(index >= N){
            if()
        }

    }




}


    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> listOfList = new ArrayList<>();
        printSubsequence(0,list,nums,listOfList);
        return listOfList;
    }
   static void printSubsequence(int index, List<Integer> list, int[]nums , List<List<Integer>> listOfList){

      if(index >= nums.length){
          listOfList.add(new ArrayList<>(list));
          return;
      }
      list.add(nums[index]);
      printSubsequence(index+1,list,nums,listOfList);
       list.removeLast();
       printSubsequence(index+1,list,nums,listOfList);
   }



    public static int countOfCharactersUsingHashIng(String s,char c){
        int count = 0;
        int hash[] = new int[26];
        s = s.toLowerCase(); // Normalize to lowercase
        c = Character.toLowerCase(c);
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) - 'a']++;
        }
        count = hash[c-'a'];
        return count;
    }

    public static List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        List<Integer> ls = new ArrayList<>();
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mpp.put(arr[i],mpp.getOrDefault(arr[i],0)+1);
        }

        for(int i=1;i<arr.length+1;i++){
            ls.add(mpp.getOrDefault(i,0));
        }

        return ls;
    }


    public static int countOfCharactersUsingHashMap(String s,char c){
        int count = 0;
      Map<Character,Integer> mpp= new HashMap<>();
        s = s.toLowerCase(); // Normalize to lowercase
        c = Character.toLowerCase(c);
        for(int i=0;i<s.length();i++){
            mpp.put(s.charAt(i),mpp.getOrDefault(s.charAt(i) ,0 )+1);
        }


        return mpp.getOrDefault(c,0);
    }


    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        int sum=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
    }




    static int arraySum(int arr[]) {
        // code here


        int sum = Arrays.stream(arr).sum();

      return sum;
    }

    public static String reverseWords(String str) {

//        String st[] = str.trim().split("\\s+"); // Trim and split on multiple spaces
        String st[] = str.split(" ");
        String rv = "";

        for(int i=0;i<st.length;i++){
            System.out.println(st[i]);
        }

        for(int i=st.length-1;i>=0;i--){
            rv = rv+st[i]+" ";
        }
        return rv;
    }


    public static char findTheDifference(String s, String t) {
     // Using ASCI Values to get the missing char
        int sumS = 0;
        int sumT = 0;
        for(int i=0;i<s.length();i++){
            sumS += s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            sumT += t.charAt(i);
        }

        return (char) (sumT-sumS);
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
