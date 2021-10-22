package com.company;

public class Main {
public static final int SIZE = 10;
    public static void main(String[] args) {
	top();
    }

    //Note: Every line (including whitespace) is 2 * SIZE + 3 characters long
    public static void base() {
        //print("[=")
        //for SIZE number of times print("I=");
        //print("]");
        //for 2 * SIZE + 3 number of times
        //print("=")
    }
    public static void top() {
    //rough pseudocode:
        // Print spaces
        // print /'s
        // print x's
        // print \'s
        //(optional) reuse space print statement
        // iterate SIZE + 1 number of times
        //draw base

        for (int lines = 1; lines <= SIZE + 1; lines++) {
            //Space Loop
                //inversely proportionate to counter index
            for (int spaces = SIZE - lines; spaces >= 0; spaces--) {
                System.out.print(" ");
            }

            // / loop
                // does not change
                    // not even a loop actually
            System.out.print("/");


            // x loop
                //proportionate to counter
                    //guess: 2 * counter - 1
            for (int x = 1; x <= 2 * lines - 1; x++) {
                System.out.print("x");
            }

            // \ loop
                // does not change

            System.out.print("\\");

            // space loop
                // inversely proportionate
            for (int spaces = SIZE / 2 - lines; spaces >= lines; spaces--) {
                System.out.print(" ");
            }
            //TODO: Above method was copy pasted. I should rewrite as a method to reduce redundancy
            // println
            System.out.println();
        }



    }

    public static void upper(){
        //for SIZE - 2 number of times {
        //  for SIZE times {
        //      System.out.print("| - ");
        //  System.out.println("|");

        //}
    }

    public static void lower() {
        //for SIZE times {
            //System.out.print("|");
        //print dots
        //print tildas
        //print dots
        //print |
        // print base
    }

    public static void bottom() {
        // for SIZE - 1 number of times {
        // print spaces
        // print /
        // print |
        // print \
        // print spaces
    }
}
