package main;

import java.util.Scanner;

public class Main {
//all about gui
	public void display_menu() {
		System.out.println("1) Option 1\n2) Option 2\n3) Option 3\n4) Option 4\n5) Option 5\n6) Option 6");
		System.out.print("Selection: ");
	}

	public void question() {
		System.out.println("Would you like to proceed or quit?");
		System.out.println("To proceed enter 9.");
		System.out.println("If you wish to quit enter 0.");
		Scanner q = new Scanner(System.in);

		switch (q.nextInt()) {
		case 0:
			System.out.println("Thank you and godbye.");
			break;

		case 9:
			System.out.println("Please proceed.");
			new Main();
			break;
		default:
			System.err.println("Unrecognized option");
			break;
		}
	}

	public Main() {
		Scanner in = new Scanner(System.in);
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
			WeekFour.do4(); // Classes and Methods
			break;

		default:
			System.err.println("Unrecognized option");
			break;
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}

/*
 * package main;
 * 
 * import java.util.Arrays; import java.util.InputMismatchException; import
 * java.util.Scanner; import main.TicTacToe;
 * 
 * 
 * class Main {
 * 
 * public static void main(String[] args) throws java.lang.Exception {
 * 
 * Brendan.printGrade(85); CollegeClass cop2006 = new CollegeClass();
 * cop2006.printInfo(); cop2006.setName("COP 2006"); cop2006.setCredits(4);
 * String[] names = new String[3]; names[0] = "brendan"; names[1] = "zacc";
 * names[2] = "tim"; cop2006.setRoster(names); cop2006.printInfo();
 * 
 * } }
 */