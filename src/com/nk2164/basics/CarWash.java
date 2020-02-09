package com.nk2164.basics;
import java.util.Scanner;   // Scanner
 
 
public class CarWash 
{
 
    public static void main(String[] args) 
    {
        String name;                // What Car wash
        int trips;                  // Trips to car wash
        double washPrice;           // Car wash Price
        double totSpent;            // Total money spent
         
        Scanner keyboard = new Scanner(System.in);
         
        // Get Car Wash
        System.out.print("What car wash did you use? ");
        name = keyboard.nextLine();
         
        // Get total number of trips to car wash
        System.out.print("How many times a week do you go to the Car Wash");
        trips = keyboard.nextInt();
         
        // Car wash price
        System.out.print("What is the price of the car wash");
        washPrice = keyboard.nextDouble();
         
        // Calculate total money spent.
        totSpent = trips * washPrice;
         
        // Display results
        System.out.println("At, " + name);
        System.out.println("you Total spent is $" + totSpent);
     
    }   // end of main
     
}   // end of public class CarWash