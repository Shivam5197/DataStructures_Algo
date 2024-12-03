package org.functional.BasicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BasicMaths {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Please Enter the Number: ");
		Integer i = sc.nextInt();
		sc.close();
		i = 220;
	   int j= 1101;
		//optimizedDivisoners(i);
		System.out.println("Output is: " + gcdANDhcfBruteForce(i,j));
		System.out.println("Output is: " + gcdANDhcfEculodeanAlgo(i,j));
	}

	public static void extortionOfNumbers(int num) {

		// In this function we will be taking individual numbers from the number
		while (num > 0) {
			int lastgiit = num % 10;
			System.out.println("Value of LastDigit here is : " + lastgiit);
			num = num / 10;
			System.out.println("Value of num here is : " + num);

//			System.out.println(lastgiit);
		}
	}

	public static void countOfNumbers(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count = count + 1;

		}
		System.out.println(count);
	}

	public static void RevereseNumbers(int num) {

		int reverSerNumber = 0;
		while (num > 0) {
			int lastgiit = num % 10;
			System.out.println("Value of LastDigit here is : " + lastgiit);
			num = num / 10;
			System.out.println("Value of num here is : " + num);
			reverSerNumber = (reverSerNumber * 10) + lastgiit;
			System.out.println("Value of reverSerNumber here is : " + reverSerNumber);

		}
	}

	public static void PallindromeNumbers(int num) {
		int duplicateNum = num;
		int reverSerNumber = 0;
		while (num > 0) {
			int lastgiit = num % 10;
			System.out.println("Value of LastDigit here is : " + lastgiit);
			num = num / 10;
			System.out.println("Value of num here is : " + num);
			reverSerNumber = (reverSerNumber * 10) + lastgiit;
			System.out.println("Value of reverSerNumber here is : " + reverSerNumber);
			System.out.println();
			System.out.println();
			System.out.println();

			if (duplicateNum == reverSerNumber) {
				System.out.println(" Pallindrome");
			} else {
				System.out.println("Not Pallindrome");
			}

		}
	}

	public static void armStrongNumbers(int num) {
		System.out.println("\r\n"
				+ "An Armstrong number (also known as a narcissistic number or pluperfect digital invariant) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.");

		System.out.println("Example :=> 153: 1*3 + 5*3 + 3*3 = 1 + 125 + 27 = 153\r\n" + "");
		int dupliCate = num;
		int sum = 0;
		while (num > 0) {
			int lastgiit = num % 10;
			System.out.println("Value of LastDigit here is : " + lastgiit);
			num = num / 10;
			System.out.println("Value of num here is : " + num);

			sum = sum + (lastgiit * lastgiit * lastgiit);

			if (sum == dupliCate) {
				System.out.println("ArmStrong Number ");
			} else {
				System.out.println("Not ArmStrong Number ");

			}
		}
	}

	
	public static void findAllDevisiors(int num) {
		   if(num<1){
	            System.out.println(0);
	        }
	 
		   int sum =0;
		   //We need a helper method that will return the sum 
	       for(int i=1;i<=num;i++) {
	    	   sum = sum +countDivisors(i);
	       }
	       
	       System.out.println("The final sum is => " + sum);
	}
	// this is helper method
	public static int countDivisors(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
	    	  
			 if(num%i ==0) {
				 sum = sum+i;
			 }
	       }
		
		return sum;
	}
		
	
	
	public static void optimizedDivisoners(int num) {
	List<Integer> list = new ArrayList<Integer>();
	
	for(int i=1;i*i<=num;i++) {
		if(num%i==0) {
			list.add(i);
			if((num/i) != i) {
				list.add(num/i);
			}
		}
		Collections.sort(list);
	}
	System.out.println(list.toString());
	}
	
    static int isPrime(int N){
        // code here
        
        int count=0;
            for(int i=1;i*i<=N;i++){
                if(N%i==0){
                    count++;
                    System.out.println("Value of I - "+ i +" Value of N "+N+" value of count" + count);
                    if((N/i) != i){
                        count++;
                        System.out.println("(N/i) != i Value of I - "+ i +" Value of N "+N+" value of count" + count);
                    }
                }
            }
            System.out.println(count);
        if(count == 2){
            return 1;
        }else{
            return 0;
        }
    }

    
    static int gcdANDhcfBruteForce(long a,long b) {
    	
    	int gcd = 0;
    	
    	
    	for(int i=1;i<=Math.min(a, b);i++) {
    		
    		if(a%i==0 && b%i==0) {
    			gcd=i;
    		}
    	}
    	return gcd;
    }
    
    
    static int gcdANDhcfEculodeanAlgo(int a,int b) {
    	
    	int gcd = 0;
    	
    	while(a>0 && b>0) {
    		if(a>b) {
    			a=a%b;
    			}
    		else { 
    			b= b%a;}
    		
    	}
    	
    	if(a==0)
    	return b;
    	
    	return a;
    }
    
	
	
	
}
