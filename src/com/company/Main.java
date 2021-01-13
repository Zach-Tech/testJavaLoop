package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {
    private String reRun;
    public static void main(String[] args) {
	// write your code here
       String yes = "";
       int hours = 0;
       double rate, tot = 0;
       Scanner input = new Scanner(System.in);
       do{System.out.println("How many hours did you work: ");
       hours = input.nextInt();
       System.out.println("Whats your rate: ");
       rate = input.nextInt();
       tot = (hours*rate);
       System.out.printf("Hours x Rate: %s", tot);
       System.out.println("\nRun again?\nYes//No: ");
       yes = input.next();
           }while(yes.equalsIgnoreCase("yes"));}

    // wow man fuck java
}
