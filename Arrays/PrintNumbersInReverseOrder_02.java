package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String [] arr = new String[number];

        for (int index = 0; index < number; index++) {
            String input = scanner.nextLine();
            arr [index] = input;
        }

        for (int i = number - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
