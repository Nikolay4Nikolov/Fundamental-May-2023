package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        //1 2 3 4 5 6
        int sum = 0;
        for (int index = 0; index < numbersArr.length; index++) {
            if (numbersArr[index] % 2 == 0) {
                sum += numbersArr[index];
            }
        }

        System.out.println(sum);
    }
}
