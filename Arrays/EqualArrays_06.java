package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int [] secondArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        boolean isIdentical = true;
        for (int index = 0; index < firstArr.length; index++) {
            if (firstArr[index] == secondArr[index]) {
                sum += firstArr[index];
            } else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", index);
                isIdentical = false;
                break;
            }
        }

        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
