package org.functional.Patterns;

public class Pattern18 {

	public static void main(String[] args) {

		int n=5;

		
		for(int i=1;i<=n;i++) {
			
			char ch = (char)((int)(n+ 'A'-1));
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch--;
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}

}
