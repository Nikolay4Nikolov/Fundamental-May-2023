package MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        smallestNumber(firstNumber, secondNumber, thirdNumber);

    }
    public static void smallestNumber (int num1, int num2, int num3) {
        if (num1 <= num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 <= num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
