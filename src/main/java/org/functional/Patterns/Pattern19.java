package org.functional.Patterns;

public class Pattern19 {

	
	public static void main(String[] args) {
		
		
		
		int n=5;
		
		revCrown(n);
		crown(n);

		
	}
	
	
	public static void revCrown(int n) {
		
		int initialSpace =0;
		for(int i=0;i<n*2;i++) {
			//Star
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<initialSpace;j++) {
				System.out.print(" ");
				
			}
			//Star
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			initialSpace +=2;

			System.out.println();
		}

	}
	
	public static void crown(int n) {
		 int initialSpace =2*n-2;
		for(int i=1;i<=n;i++) {
			//Star
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<initialSpace;j++) {
				System.out.print(" ");
				
			}
			//Star
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
			initialSpace -=2;
		}

	}
	
}
