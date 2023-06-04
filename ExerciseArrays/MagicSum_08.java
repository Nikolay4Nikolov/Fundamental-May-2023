package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int number = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index < numbersArr.length - 1; index++) {
            int sumPair = 0;
            for (int i = index + 1; i < numbersArr.length; i++) {
                sumPair = numbersArr[index] + numbersArr[i];
                if (sumPair == number) {
                    System.out.println(numbersArr[index] + " " + numbersArr[i]);
                }
            }


        }

    }
}
