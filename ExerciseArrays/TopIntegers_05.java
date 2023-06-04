package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentNum = 0;

        for (int index = 0; index < numbersArr.length - 1; index++) {
            currentNum = numbersArr[index];
            boolean isBigger = false;

            for (int i = 0; i < numbersArr.length - 1; i++) {
                if (i >= numbersArr.length - 1) {
                    break;
                }
                if (currentNum > numbersArr[index + 1]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger){
                System.out.print(currentNum + " ");
            }
        }
        System.out.print(numbersArr[numbersArr.length - 1]);

    }
}
