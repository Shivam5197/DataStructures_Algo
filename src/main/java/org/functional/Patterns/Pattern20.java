package org.functional.Patterns;

public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=5;
		int space = n*2-2;

		for(int i=1;i<=n*2-1;i++) {
			int stars = i;
			
			if(i>n)
				stars = 2*n-i;
			//Star
			
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			
			//Space
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			
			//Star
			for(int j=1;j<=stars;j++) {
				System.out.print("*");
			}
			
			
			if(i<n) {
			space = space-2;}
			else {
				space = space+2;
			}
			
			
			System.out.println();
		}
		
		
	}

}
