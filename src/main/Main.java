package main;

import java.util.Scanner;

public class Main {
  static Scanner in = new Scanner(System.in);

  // all about gui
  public void welcome() {
    System.out.print("Welcome to my Program");
  }

  public static void display_menu() {
    System.out.println("1) Hello world \n2) Elements \n3) TicTacToe Game \n4) Area of a Bedroom \n5) Option \n6) Option \n7) option ");
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
          System.out.println("You picked option 3");
          TicTacToe.do3();

          break;

        case 4:
          System.out.println("You picked option 4"); // Classes and Methods
          WeekFour.do4();
          break;

        case 5:
          WeekFive.do5();
          break;

        case 6:
          WeekSix.do6();
          break;

        /*
         * case 7: CollegeClass.do7(); break;
         * 
         * /* case 8: WeekFive.do5(); break;
         * 
         * case 9: WeekSix.do6(); break;
         * 
         * case 10: CollegeClass.do7(); break;
         * 
         */ default:
          System.err.println("Unrecognized option");
          break;


      }

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

        default:
          System.err.println("Unrecognized option");
          break;
      }
    }
  }

}



/*
 * package main;
 * 
 * import java.util.Arrays; import java.util.InputMismatchException; import java.util.Scanner;
 * import main.TicTacToe;
 * 
 * 
 * class Main {
 * 
 * public static void main(String[] args) throws java.lang.Exception {
 * 
 * Brendan.printGrade(85); CollegeClass cop2006 = new CollegeClass(); cop2006.printInfo();
 * cop2006.setName("COP 2006"); cop2006.setCredits(4); String[] names = new String[3]; names[0] =
 * "brendan"; names[1] = "zacc"; names[2] = "tim"; cop2006.setRoster(names); cop2006.printInfo();
 * 
 * } }
 */
