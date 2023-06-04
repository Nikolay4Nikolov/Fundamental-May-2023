package MethodsExercise;

import java.util.Scanner;

public class TopNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int index = 1; index <= n; index++) {
            if (sumDigitDivide(index) % 8 == 0) {
                if (consistOdd(index)) {
                    System.out.println(index);
                }
            }
        }

    }
    public static int sumDigitDivide (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;

    }
    public static boolean consistOdd (int num) {
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}

