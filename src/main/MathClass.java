package main;
import java.util.Scanner;
public class MathClass {
//stream to main
	public static void do24() {
	    //scannner
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Tell me the size of your slice and I will tell"); 
	    System.out.println("you which is larger, the number entered, or PI");
	    double slice = scan.nextDouble();
	    //method
	    //parameter =math.PI,Slice
	    double result = Math.max(Math.PI, slice);
	    System.out.println(result);
	    // output the larger value, slice or PI
	  }
	}
// methode call is the whole code but in the end it will produce a number
/*
*public void sum(int x, int y)
*{
*System.out.println(x+y);
*}
*public static void main (String[]args)
*{
*Test b=new Test();
*b.sum(10,20);
*[Argument^^]
*/