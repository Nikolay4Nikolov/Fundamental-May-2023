package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int elementExist = 0;
        boolean isExist = false;


        for (int index = 0; index < numbersArr.length; index++) {

            int sumLeft = 0;
            for (int i = 0; i < index; i++) {
                sumLeft += numbersArr[i];
            }
            int sumright = 0;
            for (int j = numbersArr.length - 1; j > index; j--) {
                sumright += numbersArr[j];
            }

            if (sumLeft == sumright) {
                elementExist = index;
                isExist = true;
                break;
            }

        }

        if (isExist) {
            System.out.println(elementExist);
        } else {
            System.out.println("no");
        }
    }
}
