package main;
import java.util.Scanner;
public class ContinueClass {
	 public static void do13() {
      
      Double number, sum = 0.0;
      Scanner input = new Scanner(System.in);
      
      for (int i = 1; i < 6; ++i) {
         System.out.print("Enter a number: ");
         number = input.nextDouble();
         
         if (number <= 0.0) {
            continue;
         }
         
         sum += number;
      }
      System.out.println("Sum = " + sum);
   }
}