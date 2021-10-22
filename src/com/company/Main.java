package com.company;

public class Main {
public static final int SIZE = 5;
    public static void main(String[] args) {
	top();
    upper();
    lower();
    bottom();
    }

    //Note: Every line (including whitespace) is 2 * SIZE + 3 characters long
    public static void base() {

        //print("[=")
        System.out.print("[=");

        //for SIZE number of times print("I=");

        for (int i = 1; i <= SIZE; i++) {
            System.out.print("I=");
        }
        //print("]");

        System.out.print("]");

        // line break

        System.out.println();

        //forSIZE  + 3 number of times
        //print("=")

        for (int i = 1; i <= 2 * SIZE + 3; i++) {
            System.out.print("=");
        }
        System.out.println();
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

        // call base function

        base();



    }

    public static void upper(){
        //for SIZE - 2 number of times {

        for (int lines = 1; lines <= SIZE -2; lines++) {

            // print whitespace
            System.out.print("  ");
            //  for SIZE times {
            for (int i = 1; i <= SIZE - 1; i++) {
                //      System.out.print("| - ");
                System.out.print("|-");
            }
            //  System.out.println("|");
            System.out.println("| ");
        }
        // call base function

        base();
    }

    public static void lower() {
        //for SIZE times {

        for (int lines = 1; lines <= SIZE; lines++) {
            //System.out.print("|");
            System.out.print(" |");
            //print dots
                // dots = lines - 1
            //TODO: Extract dots() method
            for (int i = 1; i <= lines - 1; i++) {
                System.out.print(".");
            }
            //print tildas
                //tildas = 2* SIZE - 2* lines + 1
            for (int i = 2 * SIZE - 1; i >= 2 * lines - 1; i-- ) {
                System.out.print("~");
            }
            //print dots
                //TODO: Extract and call dots()
            for (int i = 1; i <= lines - 1; i++) {
                System.out.print(".");
            }
            //print |
            System.out.println("| ");
        }
        // print base
        base();
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
