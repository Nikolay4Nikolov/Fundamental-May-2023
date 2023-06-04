package ExerciseArrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        String[] firstArr = firstText.split(" ");
        String[] secondArr = secondText.split(" ");

        for (int index = 0; index < secondArr.length; index++) {
            for (int i = 0; i < firstArr.length; i++) {
                if (secondArr[index].equals(firstArr[i])) {
                    System.out.print(secondArr[index] + " ");
                }

            }
        }
    }
}
