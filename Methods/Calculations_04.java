package Methods;

import java.util.Scanner;

public class Calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (inputText) {
            case "add":
                printAdd(firstNumber, secondNumber);
                break;
            case "multiply":
                printMultiply(firstNumber, secondNumber);
                break;
            case "subtract":
                printSubtract(firstNumber, secondNumber);
                break;
            case "divide":
                printDivide(firstNumber, secondNumber);
                break;
        }
    }
    public static void printAdd(int firstNum, int secondNum) {
        int result = firstNum + secondNum;
        System.out.println(result);
    }
    public static void printMultiply(int firstNum, int secondNum) {
        int result = firstNum * secondNum;
        System.out.println(result);
    }
    public static void printSubtract(int firstNum, int secondNum) {
        int result = firstNum - secondNum;
        System.out.println(result);
    }
    public static void printDivide(int firstNum, int secondNum) {
        int result = firstNum / secondNum;
        System.out.println(result);
    }
}
