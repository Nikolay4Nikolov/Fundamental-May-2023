package ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String [] commandArr = command.split(" ");
            if (commandArr[0] .equals("decrease")) {
                for (int index = 0; index < numbersArr.length; index++) {
                    numbersArr[index]--;
                }
            } else {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                if (commandArr[0].equals("swap")) {
                    int currentNumber = 0;
                    currentNumber = numbersArr[index1];
                    numbersArr[index1] = numbersArr[index2];
                    numbersArr[index2] = currentNumber;

                } else if (commandArr[0].equals("multiply")) {
                    numbersArr[index1] = numbersArr[index1] * numbersArr[index2];
                }
            }

            command = scanner.nextLine();
        }
            System.out.println(Arrays.toString(numbersArr).replace("[", "").replace("]", ""));

    }
}
