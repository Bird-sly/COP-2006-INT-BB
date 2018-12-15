package main;
import java.util.Scanner;


public class SmallestNumber {
	/* Java Program Example - Find Smallest Element in Array */
	
	
		public static void do18() {
			  {
	       int small, size, i;
	       int arr[] = new int[50];
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Array Size : ");
	       size = scan.nextInt();
		   
	       System.out.print("Enter Array Elements : ");
	       for(i=0; i<size; i++)
	       {
	           arr[i] = scan.nextInt();
	       }
		   
	       System.out.print("Searching for the Smallest Element....\n\n");
		   
	       small = arr[0];
		   
	       for(i=0; i<size; i++)
	       {
	           if(small > arr[i])
	           {
	               small = arr[i];
	           }
	           
	       }
		   
	       System.out.print("Smallest Element = " + small); 
	   }
	}
}