package org.functional.String;

import java.util.Scanner;

public class StringBasics {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
        // Read a string input from the user
        System.out.println("Enter a string:");
        String userInput = sc.nextLine();
        
        // Output the input string
        System.out.println("You entered: " + userInput);
        
        // Close the scanner
        sc.close();
             
      System.out.println(recursiveIsPallindromen(userInput,userInput.length()));  
	}
	
	
	static boolean isPallindrome(String s) {
		
		
		 int left = 0, right = s.length()-1;
	        while(left<right)
	        {
	            char l = s.charAt(left), r = s.charAt(right);
	            if(!Character.isLetterOrDigit(l)) 
	                left++;
	            else if(!Character.isLetterOrDigit(r)) 
	                right--;
	            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
	                return false;
	            else {
	                left++; 
	                right--;
	            }
	        }
	        return true;		
	}
	

	static boolean recursiveIsPallindromen(String s,int n) {
		
		int i = 1;
		
		if(i>=n/2) {
			System.out.println("i>=n/2 :=> ");
			return true;
		}		
		if(s.charAt(i) != s.charAt(n-i-1)) {
			System.out.println("Char At I :=> " + i + " Char at n-i-1 :=> "+ s.charAt(n-i-1));
			return false;
		}		
		return recursiveIsPallindromen(s, i+1);
	}
		
}
