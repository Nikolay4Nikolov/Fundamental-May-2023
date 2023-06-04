package ExerciseArrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberArr = scanner.nextLine().split(" ");
        int num = Integer.parseInt(scanner.nextLine());
        String currentNumber = "";

        for (int i = 0; i < num; i++) {
            currentNumber = numberArr[0];
            for (int j = 0; j < numberArr.length - 1; j++) {
                numberArr[j] = numberArr[j + 1];
            }
            numberArr[numberArr.length - 1] = currentNumber;

        }

        for (int i = 0; i < numberArr.length; i++) {
            System.out.print(numberArr[i] + " ");
        }
    }
}
