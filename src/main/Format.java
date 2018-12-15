package main;
//all about formating
public class Format {
 //stream to main

	  public static void do21() {  
		String str = "just a string";  
			
		
		String formattedString = String.format("My String is %s", str);  
			
		/*formatting the  value passed and concatenatin
		 *6 digets 
		 */
		String formattedString2 = String.format("My String is %.6f",12.121);
//prints first 
		System.out.println(formattedString); 
		
		//print second string
		System.out.println(formattedString2);  
	   }
	}