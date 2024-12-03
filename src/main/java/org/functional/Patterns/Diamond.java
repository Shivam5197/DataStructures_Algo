package org.functional.Patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n =50;
		
		// Write your code here
	        printtri(n);
	        printRev(n);


	}


    public static void printtri(int n){
        for(int i=0;i<n;i++){

            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //Space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }

    }

      public static void printRev(int n){

        for(int i=0;i<n;i++){

            //Space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            for(int j=0;j< 2*n - (2*i+1);j++){
                System.out.print("*");
            }
            //Space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }


      }
  

}
