package org.functional.RecursionProblems;

public class TUFRecursionPlaylist {
    // ANSI escape code constants for text colors
    public static final String BLUE = "\u001B[34m";
    public static final String CYAN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String WHITE = "\u001B[37m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLACK = "\u001B[30m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String RESET = "\u001B[0m";


    public static void main(String[] args) {

        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "Lecture 1. Nth Fibonacci Number");
        System.out.println(CYAN + FirstLecture_fiboRecursive(5));
        System.out.println(WHITE + "************************************************************************");
        System.out.println();

        System.out.println(WHITE + "************************************************************************");
        System.out.println(RED + "Lecture 1. Nth Fibonacci Number");
        System.out.println(CYAN + FirstLecture_fiboRecursive(5));
        System.out.println(WHITE + "************************************************************************");
        System.out.println();


    }


    static int FirstLecture_fiboRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        int first = FirstLecture_fiboRecursive(n - 1);
        int last = FirstLecture_fiboRecursive(n - 2);
        return first + last;

    }

}
