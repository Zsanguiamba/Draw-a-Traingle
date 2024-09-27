
/**
 * Write a description of class Lab5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lab5 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double x;
      double y;
      double z;
      
      x = scnr.nextDouble();
      y = scnr.nextDouble();
      z = scnr.nextDouble();
      
      System.out.print(Math.pow(x, z));
      System.out.print(" ");
      System.out.print(Math.pow(x, Math.pow(y, z)));
      System.out.print(" ");
      System.out.print(Math.abs(y));
      System.out.print(" ");
      System.out.println(Math.sqrt(Math.pow(x*y, z)));
   }
}
