package main;

public class BooleanExample {


	  public static void do19() {
	    { 
	        // parsing different Strings 
	        boolean b1 = Boolean.parseBoolean("True"); 
	        boolean b2 = Boolean.parseBoolean("TruE"); 
	        boolean b3 = Boolean.parseBoolean("False"); 
	        boolean b4 = Boolean.parseBoolean("FALSE"); 
	        boolean b5 = Boolean.parseBoolean("brendan"); 
	          //this is to print each parseBoolean statments
	        System.out.println(b1); 
	        System.out.println(b2); 
	        System.out.println(b3); 
	        System.out.println(b4); 
	        System.out.println(b5); 
	          //Will match up with each one
	    } 
	  }
}