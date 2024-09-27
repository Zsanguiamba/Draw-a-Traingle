
/**
 * Write a description of class Lab4 here.
 *
 * @Zaden Sanguiamba
 * @9/22
 */
import java.util.Scanner;
public class Lab4
{
       public static void main(String[] args)
       { 
           Scanner scnr = new Scanner(System.in);
           int Age;
           int Weight;
           int HeartRate;
           int Time;
           double Calories;
           Age = scnr.nextInt();
           Weight = scnr.nextInt();
           HeartRate = scnr.nextInt();
           Time = scnr.nextInt();
           Calories = Time*(Age*0.2757+Weight*0.03295+HeartRate*1.0781-75.4991)/8.368;
           System.out.print("Calories: ");
           System.out.printf("%.2f", Calories);
           System.out.println(" calories");
        }
    }
