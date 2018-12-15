package main;

/*
 * Brendan Beardsley
 * 
 * Descriptions at the bottom 
 */

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	// all about gui
	public void welcome() {
		System.out.print("Welcome to my Program");
	}

	public static void display_menu() {
		System.out.println("1) Hello world \n2) Elements \n3) TicTacToe  \n4)Area \n5)Phone \n6)Bird \n7)Classes  \n8)Strings  \n9)Score \n10) Polymorphism ");
		System.out.println("11) final \n12 do while loop \n13 continue example\n14 overload \n15 scanner one d \n16 random \n17 2 d small \18 array ");
		System.out.println("19) boolean \n20 small int \n21 c Escape \n22 super  \n23 math class \n24 sum \2 sum 5");
		System.out.print("Selection: ");
	}

	// Add

	public static void main(String[] args) {
    boolean continueProgram = true;
    while (continueProgram) {
      display_menu();

      switch (in.nextInt()) {
        case 1:
          System.out.println("You picked option 1");
          WeekOneHello.do1();


        break;

        case 2:
          System.out.println("You picked option 2");
          WeekTwoElements.do2();

          break;

        case 3:
          System.out.println("You picked option 3");//array
          TicTacToe.do3();

          break;

        case 4:
          System.out.println("You picked option 4"); // Classes and Methods
          WeekFour.do4();
          break;

        case 5:
        	System.out.println("You picked option 5");//
          WeekFive.do5();
          break;

        case 6:
        	System.out.println("You picked option 6");//
          WeekSix.do6();
          break;

         case 7:
        	 System.out.println("You picked option 7");//
        	 Classes.do7();
          break;
         
          case 8:
        	  System.out.println("You picked option 8");//
        	  Strings.do8(); 
          break;
          
       
          case 10:
        	  System.out.println("You will see some melee characters");// polymorphism and  inheritance
        	  Creature.do10(); 
          break;
          
          case 11:
        	  System.out.println("Final");// final
        	  FinalVariable.do11(); 
          break;
          
          case 12:
         	 System.out.println("You picked option 12");//do/while loops
         	DoWhileLoop.do12(); 
          break;
           
          case 13:
          	 System.out.println("You picked option 13");//used continue
          	ContinueClass.do13(); 
           break;
            
          case 14:
          	 System.out.println("You picked option 14");// Overloaded a method
          	DisplayOverloading.do14(); 
           break;
            
          case 15:
          	 System.out.println("You picked option 15");//Array scanner one dimensional 
          	OnedimensionalScanner.do15(); 
           break;
            
          case 16:
          	 System.out.println("You picked option 16");//random class 
          	RandomClass.do16(); 
           break;
            
          case 17:
          	 System.out.println("You picked option 17");//Two dimensional array
          	TwodArray.do17(); 
           break;
           
          case 18:
           	 System.out.println("You picked option 18");//smallest number in array
           	SmallestNumber.do18(); 
            break;
          case 19:
        	  System.out.println("Boolian");//Boolian variables
        	 BooleanExample.do19(); 
          break;
          
          case 20:
        	  System.out.println("smallest value");// in array finds smallest int
        	 FindSmallest.do20(); 
          break;
          
          case 21:
        	  System.out.println("Formating");//format
        	  Format.do21(); 
          break;
          
          case 22:
        	  System.out.println("esc Sequences");//esc 
        	 EscapeSequences.do22(); 
          break;
          
          case 23:
        	  System.out.println("Super");//Super
        	  SuperOC.do23(); 
          break;
          
          case 24:
        	  System.out.println("Math class");//Class for math
        	  MathClass.do24(); 
          break;
          
          case 25:
        	  System.out.println("Sum array");// finding the sum of an array
        	  SumArray.do25(); 
          break;
          
         
             
            
         
         default:
          System.err.println("Unrecognized option");
          break;


      }
//end gui
      System.out.println("Would you like to proceed or choose something else?");
      System.out.println("To end enter 9.");
      System.out.println("If you wish to continue enter 0.");

      switch (in.nextInt()) {
        case 0:
          System.out.println("What next do you want to see?");

          break;

        case 9:
          System.out.println("Thank you and goodbye");
          continueProgram = false;
          break;
//break is to make loop continue
        default:
          System.err.println("Unrecognized option");
          break;
      }
    }
  }

}
/*
 * WeekTwo-int
 * TicTacToe-int,
 * WeekFour- double 
 * WeekFive- string
 * 
 * 
 * 
 */






/*
 * Final :
 * If you make any variable as final,
 *  you cannot change the value of final variable
 */

/*
 * Inheritance:
 * Inheritance can be defined as the process where one class
 *  acquires the properties(methods and fields) of another. 
 * With the use of inheritance the information
 *  is made manageable in a hierarchical order.
 * 
 */

/*
 * operator precedence:
 * Operator precedence is the order of operations within java when you use math. 
 * There is a operator precedence table that shows
 * how the order goes
 */


/*
 * Casting:
 * casting is taking an Object of one type
 *  and turning it into another Object type.
 *  This process is called casting a variable.
 */

/*
 * byte: The byte data type is an 8-bit 
 * signed two's complement integer. It has a
 *  minimum value of -128 and a maximum value of 127 (inclusive). 
 */

/*
 * short: The short data type is a 16-bit signed 
 * two's complement integer. It has a minimum value 
 * of -32,768 and a maximum value of 32,767 (inclusive).
 */

/*
 * int: By default, the int data type is a 32-bit signed two's
 *  complement integer, which has a minimum value 
 *  of -2^31 and a maximum value of 2^31-1
 */



/*
 * Define a method
 * Method header:
 * public statice int max("parameters"int num1, num2){
 */








