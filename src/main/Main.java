
package main;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import main.TicTacToe;

/**
 *
 *
 */
class Main {


  public static void main(String[] args) throws java.lang.Exception {
    
    
    Brendan.printGrade(85);
    CollegeClass cop2006 = new CollegeClass();
    cop2006.printInfo();
cop2006.setName("COP 2006");
cop2006.setCredits(4);
String[]names =new String[3];
names[0]="brendan";
names[1]="zacc";
names[2]="tim";
cop2006.setRoster(names);
cop2006.printInfo();



  }
}
    
    
    
    // Display menu
    System.out.println("Enter a menu selection");
    System.out.println("1. Hello World");
    System.out.println("2. Classes");
    System.out.println("3. Strings, Casting, Input");
    System.out.println("4. Classes and Methods");
    System.out.println("5. Library Classes");
    System.out.println("6. Operators, Condition Statements and Branching");
    System.out.println("7. Loops");
    System.out.println("8. OOP");
    System.out.println("9. Inheritance and Polymorphism");
    System.out.println("10. Arrays");
    System.out.println("11. Exceptions");
    System.out.println("13. Quality");
  
    // Create a scanner
    Scanner scan = new Scanner(System.in);
    scan.nextInt();

    int selection = 0;
    switch (selection) {
      case 1:
       HelloWorld.do1(); // Hello World
        break;
      case 2:
        Module02Elements.do2(); // Classes, Data Types, Variables
        break;
      case 3:
        Module03Strings.do3(); // Strings, Casting, Input
        break;
      case 4:
        Module04Methods.do4(); // Classes and Methods
        break;
      case 5:
        Module05Classes.do5(); // Library Classes
        break;
      case 6:
        Module06Conditions.do6(); // Operators, Condition Statements and Branching
        break;
      case 7:
        Module07Looping.do7(); // Loops
        break;
      case 8:
        Module08OOP.do8(); //
        break;
      case 9:
        Module09OOP2.do9(); // Inheritance and Polymorphism
        break;
      case 10:
        Module10Arrays.do10(); //
        break;
      case 11:
        Module11Exceptions.do11(); //
        break;
      case 13:
        Module13Quality.do13(); //
        break;
      default:
        System.out.println("Invalid selection");

    }

  }

}
    
    
    
  



