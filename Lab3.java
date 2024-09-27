
/**
 * Lab 3 Assignment - House
real estate summary
 *
 * @author (Zaden Sanguiamba)
 * @version (8/28/2024)
 */

import java.util.Scanner;

public class Lab3
{
   public static void main(String[] args)
   {
       Scanner scnr = new Scanner(System.in);
       int currentPrice;
       int lastMonthsPrice;
       
       System.out.print("Enter Current price:");
       currentPrice = scnr.nextInt();
        System.out.print("Enter Last Months price:");
       lastMonthsPrice = scnr.nextInt();
    
       System.out.print("This house is $");
       System.out.print(currentPrice);
       System.out.print(". The change is $");
       System.out.print(currentPrice-lastMonthsPrice);
       System.out.println(" since last month.");
       System.out.print("The estimated monthly mortgage is $");
       System.out.print((currentPrice*0.051)/12);
       System.out.print(".");
    }
}
