package main;

public class SearchArray {

	    public static void main( String [] args ) {
	         char [] list = { 'b', 'a', 'm' };
//value was found at element 1
	         // Prints 1
	         System.out.println( indexOf( 'a', list ) );
	    }

	    private static int indexOf( char c , char [] arr ) {
	        for( int i = 0 ; i < arr.length ; i++ ) {
	            if( arr[i] == c ) { 
	                return i;
	            }
	         }
	         return -1;
	     }
	 }