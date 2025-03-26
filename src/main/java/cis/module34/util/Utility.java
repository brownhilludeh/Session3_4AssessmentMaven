package cis.module34.util;


import java.util.Scanner;

/**
 * This class will hold a static instance of Scanner to be used throughout the program.  
 * This will allow us to have one place to have one scanner so we wont have to create new ones
 * in our different classes.
 * 
 * @author BJ
 * @since  20140311
 */
public class Utility {
    private static Scanner input = new Scanner(System.in);

    public static Scanner getInput() {
        return input;
    }
    
}
