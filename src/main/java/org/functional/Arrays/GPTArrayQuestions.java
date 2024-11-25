package org.functional.Arrays;

import org.functional.utils.Utils;

import java.util.*;

import static org.functional.Sortings.MergeSort.mergeSort;

public class GPTArrayQuestions {

    // ANSI escape code constants for text colors
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String PURPLE = "\u001B[35m";

    // Optionally, add a reset code to clear the color
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {


        System.out.println(RED + " We will be solving the Problems related to Array ");

        System.out.println();
        System.out.println(GREEN + "Beginner Level:");
//        ReverseAnArray();
  //      secondLargestElement();
 //       checkSortedArray();
        sumOfElementsInArray();
        countOccurenceOfElements();
        mergeTwoArrays();
        findIndexOfGivenElement();
        System.out.println();
        System.out.println(GREEN + "Intermediate Level:");

        removeDuplicatesFromArray();
        RotateBy1Number();
        RotateByKNumber();
        zerosToEnd();
        searchInSorted();
        unionOfTwoSortedArrays();
        intersectionTwoSortedArray();
        findMissingNumber();
        singleNumber();
        Longest_subarray_with_given_sum_K_IN_positives();
        Two_Sum_Problem();
        sortColors();
        majorityElements();
        Maximum_Subarray();
        buyOrSellStocks();
        rearrangeArray();
        nextPermuntation();
        LeadersInArray();
        longestConsecutiveSequenceArray();
        Set_Matrix_Zeroes();
        Rotate_Image();
        Count_Of_subarray_with_given_sum_K_IN_positives();
        System.out.println();
        System.out.println(GREEN + "Expert Level:");


    }
//###########################################################################################################################################################################################################################################

//###########################################################################################################################################################################################################################################

    public static void PrintArray(Integer[] arr, Integer number ,String color) {

        System.out.print(color + "The final output is : => ");
        for (Integer value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void sumOfElementsInArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Sum of Array Elements");
        Integer[] arr = {2, 4, 6, 8, 10};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = arr[i] + sum;
        }
        System.out.println(CYAN + " The sum of Provided array is => " + YELLOW + "" + sum);
        System.out.println(MAGENTA + "Streams Way to do it ");
        int sum2 = Arrays.stream(arr).mapToInt(Integer::intValue).sum();
        System.out.println(MAGENTA + " The sum of Provided array using streams is => " + YELLOW + "" + sum2);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################

    static void countOccurenceOfElements() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Count Occurrences of an Element");
        Integer[] arr = {2, 4, 6, 8, 10, 8};

        int count = 0;
        int element = 8;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                count++;
            }
        }
        System.out.println(CYAN + " The count of Provided element " + element + " in array is => " + YELLOW + "" + count);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################


    static void mergeTwoArrays() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Merge Two Arrays");
        Integer[] arr = {1, 3, 5};
        Integer[] arr1 = {2, 4, 6};
        Integer[] arr2 = new Integer[arr.length + arr1.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for (int j = 0; j < arr1.length; j++) {
            arr2[arr.length + j] = arr1[j];
        }

        //Now we got the values not let's sort this array

//        {4,8,7}
        int temp = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 1; j < arr2.length - i; j++) {
                if (arr2[j] < arr2[j - 1]) {
                    temp = arr2[j - 1];
                    arr2[j - 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        Utils.PrintArray(arr2, BLUE);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################


    static void findIndexOfGivenElement() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Find the Index of a Given Element:");
        Integer[] arr = {10, 20, 30, 40, 50};
        int element = 20;
        int index = Integer.MIN_VALUE;
//        System.out.println(index);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(element)) {
                index = i;
            }
        }

        if (index != Integer.MIN_VALUE) {
            System.out.println(CYAN + "The Index where we found the element is :=>" + YELLOW + " " + index);
        } else {
            System.out.println(CYAN + "The Index not found found the element :=>" + YELLOW + " " + element);
        }

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################

    static void removeDuplicatesFromArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(PURPLE + "Remove Duplicates from an Array:");
        Integer[] arr = {1, 2, 2, 3, 4, 4, 5};
        Integer[] arr2 = {1, 2, 2, 3, 4, 4, 5};
        Integer[] arr3 = {9, 8, 1, 3, 2, 3, 4, 4, 5, 8, 9};
        Integer[] newArray = new Integer[arr.length];
        // Loop through each element
        //another loop to iterate through elements trying to match
        //store in new array
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                newArray[index] = arr[i];
                index++;
            }
            newArray[index] = arr[arr.length - 1];
        }
        PrintArray(newArray, 8, PURPLE);
        System.out.println(YELLOW + " Updating the same array ! ");
        PrintArray(arr2, 8, WHITE);
        int newIndex = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] != arr2[i + 1]) {
                arr2[newIndex] = arr2[i];
                newIndex++;
            }
        }
        arr2[newIndex] = arr2[arr2.length - 1];

        PrintArray(arr2, 8, CYAN);


        System.out.println("Remove duplicates from Unsorted array");

        HashSet<Integer> arHash = new HashSet<>();

        for (int i = 0; i < arr3.length; i++) {
            arHash.add(arr3[i]);
        }
        System.out.print(RED + " Unsorted array after removing duplicates =>");
        for (Integer v : arHash)
            System.out.print(v + ", ");
        System.out.println();
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################

    static void RotateBy1Number() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Rotate an Array by 1 Positions to right");
        Integer[] arr = {1, 2, 3, 4, 5};
        int element = 2;
        PrintArray(arr, 9, RED);
        System.out.println("This left rotation ");
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
        PrintArray(arr, 9, CYAN);

        System.out.println(WHITE + "----------------------------------------------------------------------------------");
        System.out.println(PURPLE + "This is right rotation");
        Integer[] arr2 = {1, 2, 3, 4, 5};
        //expected  =  [5, 1, 2, 3, 4]
        PrintArray(arr2, 9, YELLOW);

        int temp2 = arr2[arr.length - 1];
        for (int i = arr2.length - 2; i >= 0; i--) {
            arr2[i + 1] = arr2[i];
        }
        arr2[0] = temp2;

        PrintArray(arr2, 9, YELLOW);

        System.out.println(WHITE + "----------------------------------------------------------------------------------");
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################

    static void RotateByKNumber() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Rotate an Array by K Positions");
        Integer[] arr = {1, 2, 3, 4, 5};
        int element = 17;
        int size = arr.length;
        element = element % size;
        int[] temp = new int[element];
        for (int i = 0; i < element; i++) {
            temp[i] = arr[i];
        }
        for (int i = element; i < size; i++) {
            arr[i - element] = arr[i];
        }
        for (int i = size - element; i < size; i++) {
            arr[i] = temp[i - (size - element)];
        }
        //expected = [4, 5, 1, 2, 3]
        PrintArray(arr, 10, CYAN);
        System.out.println(WHITE + "-------------------------------------------------------------------");
        System.out.println(WHITE + " OPTIMAL SOLUTION ");
        Integer[] arr2 = {1, 2, 3, 4, 5};
        int size2 = arr2.length;
        int element2 = 3;
        arrayReverseHelper(arr2, 0, size - element2 - 1);
        arrayReverseHelper(arr2, size2 - element2, size - 1);
        arrayReverseHelper(arr2, 0, size - 1);
        System.out.println("----------------------------------------------------------------------------");
        PrintArray(arr2, 10, CYAN);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################

    //Helper Reverse function Array
    static void arrayReverseHelper(Integer[] arr, int first, int last) {
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

//###########################################################################################################################################################################################################################################

    static void zerosToEnd() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Move all Zeros to the end of the array");
        Integer[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int size = arr.length;
        List<Integer> temp = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        for (int i = temp.size(); i < size; i++) {
            arr[i] = 0;
        }

        PrintArray(arr, 11, CYAN);

        System.out.println(GREEN + "Second BRUTE FORCE WAY");
        List<Integer> newList = new ArrayList<>();
        List<Integer> zeroList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                newList.add(arr[i]);
            } else {
                zeroList.add(arr[i]);
            }
        }
        newList.addAll(zeroList);
        System.out.println(CYAN + "List is =>" + newList);

        System.out.println("----------------------------------------------------------------------------");

        System.out.println(GREEN + "Optimal Solution using swapping methods");
        Integer[] arr2 = {1, 0, 2, 3, 0, 4, 0, 1};
        int j = -1;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) {
                j = i;
                break;
            }
        }
        for (int i = j + 1; i < arr2.length; i++) {
            if (arr2[i] != 0) {
                //Swap with j
                int tep = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = tep;
                j++;
            }
        }
        System.out.println("----------------------------------------------------------------------------");

        PrintArray(arr2, 11, PURPLE);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################


    static void searchInSorted() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Linear search in Array ");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        // Your code here
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("K is found at => " + i);
            } else {
                System.out.println("K is not found ");
            }
        }
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


//###########################################################################################################################################################################################################################################

    static void unionOfTwoSortedArrays() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Union of Two Sorted Arrays with Duplicate Elements ");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        // Your code here
        Integer arr[] = {1, 1, 2, 3, 4, 5};
        Integer arr1[] = {1, 2, 4, 6, 7, 8};
        Integer arr2[] = new Integer[arr.length + arr1.length];
        Set<Integer> set = new HashSet<>();
        for (int a : arr) {
            set.add(a);
        }
        for (int a : arr1) {
            set.add(a);
        }
        set.toArray(arr2);
        PrintArray(arr2, 12, PURPLE);
        System.out.println("----------------------------------------------------------------------------");

        System.out.println(GREEN + "Optimal Solution using swapping methods");
        Integer num[] = {1, 1, 2, 3, 4, 5};
        Integer num1[] = {1, 2, 4, 6, 7, 8};
        int size1 = num.length;
        int size2 = num1.length;
        List<Integer> unions = new ArrayList<>();
        int firstArrayPointer = 0;
        int secondArrayPointer = 0;
        while (firstArrayPointer < size1 && secondArrayPointer < size2) {
            // If the current element from num is smaller, add it if not already added
            if (num[firstArrayPointer] < num1[secondArrayPointer]) {
                if (unions.size() == 0 || unions.get(unions.size() - 1) != num[firstArrayPointer]) {
                    unions.add(num[firstArrayPointer]);
                }
                firstArrayPointer++;
            }
            // If the current element from num1 is smaller, add it if not already added
            else if (num[firstArrayPointer] > num1[secondArrayPointer]) {
                if (unions.size() == 0 || unions.get(unions.size() - 1) != num1[secondArrayPointer]) {
                    unions.add(num1[secondArrayPointer]);
                }
                secondArrayPointer++;
            }
            // If elements are equal, add one of them and move both pointers
            else {
                if (unions.size() == 0 || unions.get(unions.size() - 1) != num[firstArrayPointer]) {
                    unions.add(num[firstArrayPointer]);
                }
                firstArrayPointer++;
                secondArrayPointer++;
            }
        }

        // Add remaining elements from num
        while (firstArrayPointer < size1) {
            if (unions.size() == 0 || unions.get(unions.size() - 1) != num[firstArrayPointer]) {
                unions.add(num[firstArrayPointer]);
            }
            firstArrayPointer++;
        }
        // Add remaining elements from num1
        while (secondArrayPointer < size2) {
            if (unions.size() == 0 || unions.get(unions.size() - 1) != num1[secondArrayPointer]) {
                unions.add(num1[secondArrayPointer]);
            }
            secondArrayPointer++;
        }

        System.out.println(PURPLE + "Union of the two arrays => " + unions);
        System.out.println("----------------------------------------------------------------------------");

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

//###########################################################################################################################################################################################################################################


    static void intersectionTwoSortedArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Intersection between two sorted Array ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {3, 4, 5, 6, 7};
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] vis = new int[]{0, 0, 0, 0, 0,};
        ArrayList<Integer> ans = new ArrayList<>();
        // Expected output: [3, 4, 5]
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j] && vis[j] == 0) {
                    ans.add(arr1[i]);
                    vis[j] = 1;
                    break;
                }
                if (arr1[i] < arr2[j]) {
                    break;
                }
            }
        }
        System.out.println(CYAN + "Resultant Array will be => " + ans);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal Solution using Two pointers approach !");
        Integer[] arr3 = {1, 2, 3, 4, 5};
        Integer[] arr4 = {3, 4, 5, 6, 7};
        int size3 = arr3.length;
        int size4 = arr4.length;
        ArrayList<Integer> ans2 = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < size3 && j < size4) {

            if (arr3[i] < arr4[j]) {
                i++;
            } else if (arr4[j] < arr3[i]) {
                j++;
            } else {
                ans2.add(arr3[i]);
                i++;
                j++;
            }
        }
        System.out.println(CYAN + "Resultant Array with optimal solution is  will be => " + ans2);
        ans2.toArray();
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }

    //###########################################################################################################################################################################################################################################


    static void findMissingNumber() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Find missing number in an array ! ");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        // Your code here
        int arr[] = {1, 2, 3, 5};
        //    int arr[] = {3,0,1};
        int n = 5;
        for (int i = 1; i <= arr.length; i++) {
            int flag = 0;
            for (int j = 0; j <= arr.length - 1; j++) {
                if (i == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("The missing number is => " + i);
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better Solution using Hashing !");
        int hash[] = new int[n + 1];
        for (int i = 0; i <= arr.length - 1; i++) {
            hash[arr[i]]++;
        }
        for (int i = 1; i <= arr.length; i++) {
            if (hash[i] == 0) {
                System.out.println(PURPLE + " USed Hashing The missing number is => " + i);
            }
        }
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using summation  !");
        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println(PURPLE + " USed Optimal The missing number is =>  " + (sum1 - sum2));
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


//###########################################################################################################################################################################################################################################

    static void singleNumber() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Find the number that appears once, and other numbers twice. ");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int[] arr = {2, 2, 1};
        // Your code here
        int uniqueNumber = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // Count how many times arr[i] appears in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // If arr[i] appears only once, it is the unique number
            if (count == 1) {
                uniqueNumber = arr[i];
                break;
            }
        }

        System.out.println("The single number is: " + uniqueNumber);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using summation  !");
        // Your code here
        // XOR all the elements:
        int n = arr.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        System.out.println("The single number using XOR for optimised => " + xorr);


        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void Longest_subarray_with_given_sum_K_IN_positives() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Longest subarray with given sum K(positives)");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        System.out.println("Length is => " + len);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using summation  !");
        // Your code here
        int maxLen = 0;
        int sum1 = arr[0];
        int left = 0;
        int right = 0;

        while (right < arr.length) {
            while (left <= right && sum1 > k) {
                sum1 -= arr[left];
                left++;
            }
            if (sum1 == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < arr.length) {
                sum1 += arr[right];
            }
        }
        System.out.println("Length with optimal sol is => " + maxLen);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void Two_Sum_Problem() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Longest subarray with given sum K(positives)");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] sol = new int[2];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    sol[0] = arr[i];
                    sol[1] = arr[j];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println(" For the given sum => " + target);
        System.out.println("Two numbers are " + sol[0] + "," + sol[1] + " present at index " + index1 + " & " + index2);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution using HashMap  !");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                System.out.println(" The values are -> " + num + " & " + moreNeeded + " at index " + i + " & " + map.get(moreNeeded));
            }
            map.put(arr[i], i);
        }

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using summation  !");
        // Your code here
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void sortColors() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Given an array arr containing only 0s, 1s, and 2s. Sort the array in ascending order.");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] num = {0, 1, 2, 0, 1, 2};
        //Output: [0, 0, 1, 1, 2, 2]
        mergeSort(num, 0, num.length - 1);
        PrintArray(num, 19, CYAN);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution using   Counts!");
        // Your code here
        Integer[] arr = {0, 1, 2, 0, 1, 2};

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zero += 1;
            } else if (arr[i] == 1) {
                one += 1;
            } else if (arr[i] == 2) {
                two += 1;
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            arr[i] = 1;
        }
        for (int i = zero + one; i < arr.length; i++) {
            arr[i] = 2;
        }

        PrintArray(arr, 19, RED);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using " + RED + " dutch national flag algorithm  !" + GREEN);
        // Your code here
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] & arr[mid] and increment both
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap arr[mid] & arr[high] and decrese high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


    //###########################################################################################################################################################################################################################################

    static void majorityElements() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Given an array arr. Find the majority element in the array. If no majority exists, return -1.");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] arr = {3, 1, 3, 3, 2};
        //Output: 3
        int arlm = arr.length / 2;
        int majorityElement = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }
            if (count > arlm) {
                majorityElement = arr[i];
            }
        }
        System.out.println("The Majority Element is => " + majorityElement);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution using  ");
        // Your code here
        int n = arr.length;

        //declaring a map:
        HashMap<Integer, Integer> mpp = new HashMap<>();

        //storing the elements with its occurnce:
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                System.out.println("Answer using the better approch is => " + it.getKey());
            }
        }
        //       System.out.println("No majority found");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using:" + RED + " Moore’s Voting Algorithm");
        // Your code here
        int count = 0;
        int elm = arr[0];
        //      int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                elm = arr[i];
            } else if (arr[i] == elm) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elm) {
                count1++;
            }
        }
        if (count1 > n / 2) {
            System.out.println(CYAN + "Majority element using Moors -> " + elm);
        }
        //    System.out.println(" No majority element found ");

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


    //###########################################################################################################################################################################################################################################

    static void Maximum_Subarray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Given an integer array nums, find the subarray with the largest sum, and return its sum.");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //Output: 6
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution using two for loops ");
        // Your code here
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(sum, max);
            }
        }
        System.out.println("Maximum sum will be => " + max);


        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using " + RED + "Kadane's Algorithm !");

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println("Maximum sum will be Using Kadane's algo  =>" + maxi);

        System.out.println(" followup question to print the Subarray with maximum elements ");

        List<Integer> maximum = new ArrayList<>();
        int sum1 = 0;
        int maxi1 = Integer.MIN_VALUE;
        int ansStart = -1;
        int start = 0;
        int end = -1;
        for (int i = 0; i < n; i++) {

            sum1 += arr[i];

            if (sum1 > maxi1) {
                maxi1 = sum1;
                ansStart = start;
                end = i;
            }
            if (sum1 < 0) {
                sum1 = 0;
                start = i + 1;
            }
        }

        for (int i = ansStart; i <= end; i++) {
            maximum.add(arr[i]);
        }
        System.out.println(maximum.toString());

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


    //###########################################################################################################################################################################################################################################

    static void buyOrSellStocks() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " Best Time to Buy and Sell Stock Buy and sell only once");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] arr = {7, 1, 5, 3, 6, 4};
        //Output: 5
        int profit = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum profit will come when we buy at " + min + " and sell at " + (profit + min) + " profit =>  " + profit);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void rearrangeArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " Rearrange Array Elements by Sign");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        Integer[] arr = {3, 1, -2, -5, 2, -4};
        //Output: 5
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            arr[i * 2] = pos.get(i);
            arr[i * 2 + 1] = neg.get(i);
        }
        PrintArray(arr, 18, BLUE);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using");

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void nextPermuntation() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " A permutation of an array of integers is an arrangement of its members into a sequence or linear order.");
        System.out.println(GREEN + "Solution with Brute FORCE ");

//        Approach :
//      Step 1: Find all possible permutations of elements present and store them.

//        Step 2: Search input from all possible permutations.

//        Step 3: Print the next permutation present right after it.

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution !");
        Integer arr[] = {4, 5, 2, 7, 9, 6};

        /*
         * Steps to find the next permutation of the array:
         *
         * 1. Find the Break-Point (Index `i`):
         *    - The break-point is the first index `i` from the back of the array where `arr[i]` is smaller than `arr[i+1]`.
         *    - For example, if the array is {2, 1, 5, 4, 3, 0, 0}, the break-point will be at index `1` (0-based indexing),
         *      where `arr[1]` (1) is less than `arr[2]` (5).
         *    - Traverse the array backward to find this index `i` where `arr[i] < arr[i+1]`.
         *
         * 2. If No Break-Point Exists:
         *    - If the array is sorted in decreasing order (meaning it’s the last permutation in lexicographical order),
         *      then there’s no break-point.
         *    - In this case, reverse the entire array to get the first permutation in increasing order, as this will be the
         *      next permutation.
         *
         * 3. If a Break-Point Exists:
         *    - Find the smallest number greater than `arr[i]` in the right half of the array (from index `i+1` to `n-1`)
         *      and swap it with `arr[i]`.
         *    - Reverse the right half of the array from index `i+1` to the end (`n-1`) to get the next permutation in
         *      lexicographical order.
         *
         * Following these steps will yield the next permutation of the given array.
         */

        int index = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            reverseArrayHelper(arr, 0, arr.length - 1); // index stated one which means the permunation is the last and we need to return the first combination here
            PrintArray(arr, 14, RED);
        }
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                swapHelper(arr, i, index);
                break;
            }
        }

        reverseArrayHelper(arr, index + 1, n - 1);

        System.out.println(" The next permuntation will be =  > ");
        PrintArray(arr, 20, RED);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################


    static void LeadersInArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.");
        System.out.println(GREEN + "Solution with Brute FORCE ");

        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        ArrayList<Integer> sol = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                sol.add(arr[i]);
            }
        }
        sol.add(arr[n - 1]);

        System.out.println(" Leaders in the given arraya are => " + sol);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution !");

        ArrayList<Integer> ans = new ArrayList<>();

        // Last element of an array is always a leader,
        // push into ans array.
        int max = arr[n - 1];

        ans.add(arr[n - 1]);

        // Start checking from the end whether a number is greater
        // than max no. from right, hence leader.
        for (int i = n - 2; i >= 0; i--)
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }

        System.out.println("Leaders in the given array using Optimal - > " + ans);
        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }


//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################


    static void longestConsecutiveSequenceArray() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " Longest Consecutive Sequence in an Array ! ");
        System.out.println(GREEN + "Solution with Brute FORCE ");

        int[] arr = {100, 200, 1, 2, 3, 4};
        int n = arr.length;
        int length = 1;
        for (int i = 0; i < n; i++) {

            int x = arr[i];
            int count = 1;

            while (linearSearch(arr, x + 1) == true) {
                x += 1;
                count += 1;
            }
            length = Math.max(length, count);
        }
        System.out.println("The length of maximum consicutive sub array is => " + length);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution !");

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution !");


        HashSet<Integer> mySet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            mySet.add(arr[i]);
        }

        Iterator itr = mySet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################


    static void Set_Matrix_Zeroes() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + " Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's. ");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        /*
     Approach:
      1. Use two nested loops to traverse all the cells of the matrix.
      2. If any cell (i, j) contains the value 0:
        - Mark all cells in row i and column j with -1, except those that already contain 0.
      3. Repeat step 2 for every cell containing 0.
      4. Finally, replace all the cells containing -1 with 0.
      5. The matrix will be modified as per the problem's requirements.
        */


        int arr[][] = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        System.out.println("Matrix before Placing Zero in Row and columns ! ");
        printMatrix(arr);
        // Get the number of rows
        int rows = arr.length;
        // Get the number of columns (in the first row)
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == 0) {
                    markRows(arr, rows, columns, i);
                    markColumns(arr, rows, columns, j);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
        System.out.println("Matrix after Placing Zero in Row and columns ! ");
        printMatrix(arr);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution !");
        int arr2[][] = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}
        };
        int row[] = new int[rows];
        int col[] = new int[columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(arr2[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(row[i] ==1  || col[j] == 1){
                    arr2[i][j] =0;
                }
            }
        }

        System.out.println("Solution with Better approach ! ");
        printMatrix(arr2);
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution !");


        System.out.println(WHITE + "************************************************************************");
        System.out.println();


    }
//###########################################################################################################################################################################################################################################


    //###########################################################################################################################################################################################################################################


    static void Rotate_Image() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).\n" +
                "You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = arr.length;
        int m = arr[0].length;
        int [][] sol = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sol[j][n-1-i] = arr[i][j];
            }
        }
        System.out.println("Given matrix is => ");
        printMatrix(arr);

        System.out.println("Rotated Matrix using brute force method !  ");
        printMatrix(sol);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Better  Solution !");
        System.out.println("No better approach ! ");
//        System.out.println("Solution with Better approach ! ");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution !");
        int arr2[][] = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}
        };
        System.out.println(BLUE+" Matrix before rotating ");
        printMatrix(arr2);
        int n1 = arr2.length;
        int m1 = arr2[0].length;

        //Step 1 = Transpose the matrix
        for(int i=0;i<n1;i++){
            for(int j=i;j<n1;j++){
                //perfrom swap
                int temp = arr2[i][j];
                arr2[i][j] = arr2[j][i];
                arr2[j][i] = temp;
            }
        }

        //Step 1 = Reverse each  rows of matrix
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length / 2; j++) {
                int temp = 0;
                temp = arr2[i][j];
                arr2[i][j] = arr2[i][arr2.length - 1 - j];
                arr2[i][arr2.length - 1 - j] = temp;
            }
        }
        System.out.println(BLUE+" Matrix After rotating ");
        printMatrix(arr2);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();


    }
//###########################################################################################################################################################################################################################################


//###########################################################################################################################################################################################################################################

    static void Count_Of_subarray_with_given_sum_K_IN_positives() {
        System.out.println(WHITE + "************************************************************************");
        System.out.println(BLUE + "Count of sub-array with given sum K(positives)");
        System.out.println(GREEN + "Solution with Brute FORCE ");
        int[] arr = {1,2,3};
        int k = 3;
        int len = 0;
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                   count++;
                }
            }
        }
        System.out.println("count is => " + count);

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(GREEN + "Optimal  Solution using summation  !");
        // Your code here
        int n = arr.length; // Size of the given array
        Map<Integer, Integer> prefixSumMap = new HashMap<>(); // Map to store prefix sums and their frequencies
        int preSum = 0; // Variable to store the running prefix sum
         count = 0;  // Variable to store the count of subarrays with sum k

        // Initialize the map with a prefix sum of 0 occurring once
        prefixSumMap.put(0,1);

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Add the current element to the prefix sum
            preSum += arr[i];

            // Check if the difference (preSum - k) exists in the map
            int remove = preSum - k;

            // If it exists, add its frequency to the count
            count += prefixSumMap.getOrDefault(remove, 0);

            // Update the frequency of the current prefix sum in the map
            prefixSumMap.put(preSum, prefixSumMap.getOrDefault(preSum, 0) + 1);
        }

         // Return the total count of subarrays
        System.out.println("Using optimal sol count is => " + count);

        System.out.println(WHITE + "************************************************************************");
        System.out.println();
    }
//###########################################################################################################################################################################################################################################
















//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%    HELPER FUNCTIONS              %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

    public static void markRows(int[][] arr, int row, int column, int i) {
        System.out.println("markRows");
        for (int j = 0; j < column; j++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }

    public static void markColumns(int[][] arr, int row, int column, int j) {
        System.out.println("MarkColoumns");
        for (int i = 0; i < row; i++) {
            if (arr[i][j] != 0) {
                arr[i][j] = -1;
            }
        }
    }


    public static void reverseArrayHelper(Integer arr[], int first, int last) {
        while (first <= last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }

    }

    public static Boolean linearSearch(int arr[], int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    private static void swapHelper(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printMatrix(int[][] matrix) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }

        // Loop through each row
        for (int[] row : matrix) {
            // Loop through each column
            for (int element : row) {
                System.out.print(element + " "); // Print element with space
            }
            System.out.println(); // Move to the next line after each row
        }
    }

//%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%    HELPER FUNCTIONS              %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

}//Class End parenthesis

























