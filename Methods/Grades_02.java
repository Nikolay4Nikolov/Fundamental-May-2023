package Methods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numGrade = Double.parseDouble(scanner.nextLine());

        printGrade(numGrade);

    }

    public static void printGrade(double number) {
        String textGrade = "";
        if (number >= 2 && number <= 2.99) {
            textGrade = "Fail";
        } else if (number >= 3 && number <= 3.49) {
            textGrade = "Poor";
        } else if (number >= 3.50 && number <= 4.49) {
            textGrade = "Good";
        } else if (number >= 4.50 && number <= 5.49) {
            textGrade = "Very good";
        } else if (number >= 5.50 && number <= 6.00) {
            textGrade = "Excellent";
        }
        System.out.println(textGrade);
    }
}
