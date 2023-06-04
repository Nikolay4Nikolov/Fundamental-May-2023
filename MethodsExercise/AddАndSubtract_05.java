package MethodsExercise;

import java.util.Scanner;

public class AddАndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(subtract(firstNum, secondNum, thirdNum));

    }
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract (int num1, int num2, int num3) {
        return sum(num1, num2) - num3;
    }
}
