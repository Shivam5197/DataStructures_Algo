package org.functional;

/**
 * Utility class to provide ANSI escape codes for terminal text coloring.
 * These constants can be used to style text output in the console.
 */
public class TerminalColors {
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

    // Reset code to clear the applied text styling
    public static final String RESET = "\u001B[0m";

    // Private constructor to prevent instantiation of this utility class
    private TerminalColors() {
        throw new UnsupportedOperationException("TerminalColors is a utility class and should not be instantiated.");
    }
}
