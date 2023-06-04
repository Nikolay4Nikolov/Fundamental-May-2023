package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = factorial(firstNumber) * 1.0 / factorial(secondNumber);

        System.out.printf("%.2f", result);
    }
    public static long factorial (int number) {
        long sum = 1;
        for (int i = 1; i <= number; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
