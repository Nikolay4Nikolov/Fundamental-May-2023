package DataTypesAndVariablesLab;

import java.util.Scanner;

public class PoundsToDollars02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());

        double usa = pound * 1.36;

        System.out.printf("%.3f", usa);

    }
}
