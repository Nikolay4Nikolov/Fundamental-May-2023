package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int lastCount = 0;
        String lastMaxEquals = "";

        for (int index = 0; index < numbersArr.length; index++) {
            String maxEquals = "";
            int count = 0;

            for (int i = index; i < numbersArr.length; i++) {
                if (numbersArr[index] == numbersArr[i]) {
                    maxEquals += numbersArr[index] + " ";
                    count++;
                } else {
                    break;
                }
            }
            if (count > lastCount) {
                lastCount = count;
                lastMaxEquals = maxEquals;
            }

        }

        System.out.println(lastMaxEquals);
    }
}
