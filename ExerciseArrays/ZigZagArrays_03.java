package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[num];
        int[] secondArr = new int[num];
        int count = 0;

        for (int index = 0; index < firstArr.length; index++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            count++;
            if (count % 2 != 0) {
                secondArr[index] = Integer.parseInt(inputArr[1]);
                firstArr[index] = Integer.parseInt(inputArr[0]);
            } else {
                secondArr[index] = Integer.parseInt(inputArr[0]);
                firstArr[index] = Integer.parseInt(inputArr[1]);
            }

        }

        for (int index = 0; index < num; index++) {
            System.out.print(firstArr[index] + " ");
        }
        System.out.println();
        for (int index = 0; index < num; index++) {
            System.out.print(secondArr[index] + " ");
        }
    }
}
