package main;


	import java.util.Arrays;

	/**
	 * Java Program to initialize and print two dimensional array in Java.
	 */
	
	public class TwodArray {
	 public static void do17() {
	        
	      
	        String[][] names = { 
	                            {"Zacc", "Smith"},
	                            {"Brendan", "Beardsley"},
	                            {"Tim", "Gosling"},
	                           };

	        
	        //  for loop
	        int[][] board = new int[3][3];

	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[i].length; j++) {
	                board[i][j] = i + j;
	            }
	        }

	        // print two di array 
	        for (int[] a : board) {
	            for (int i : a) {
	                System.out.print(i + "\t");
	            }
	            System.out.println("\n");
	        }
	        
	        // printing 2D array using Arrays.deepToString()
	        System.out.println("another way to print 2D arrays");
	        System.out.println(Arrays.deepToString(board));

	    }

	}
