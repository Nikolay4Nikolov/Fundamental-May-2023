package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for (int index = 0; index < number.length; index++) {
            if (number[index] % 2 == 0) {
                sumEven += number[index];
            } else {
                sumOdd += number[index];
            }
        }

        int result = sumEven - sumOdd;
        System.out.println(result);

    }
}
