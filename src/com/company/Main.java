package com.company;
import java.util.Scanner;

public class Main {
    private String reRun;
    public static void main(String[] args) {
	// write your code here
       String yes = "";
       Scanner input = new Scanner(System.in);
       do{System.out.println("Testing, 1...2...3...\n");
       System.out.println("Run again?\nYes//No: ");
       yes = input.next();
           }while(yes.equalsIgnoreCase("yes"));}

    /* wow man fuck java
    *
    * I don't understand why this
    * has to be complicated
    * for the hell of it
    * but whatever
    *
    * At least it isn't VB.. everytime
    * I hit 'enter' to auto-complete something
    * it drops to the next line.
    * I'm pissed.
    * */
}
