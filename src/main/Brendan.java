package main;
class Brendan {
    public static void printGrade(double testScore) {


        String grade;

        if (testScore >= 90) {
            grade = "When some gansta starts dissin your fly girl, You give him one of deees";
        } else if (testScore >= 80) {
            grade = "B";
        } else if (testScore >= 70) {
            grade = "C";
        } else if (testScore >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("Grade = " + grade);
    }
}