package Arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        String currentSymbol = "";
        int symbols = inputArr.length;

        for (int index = 0; index <= symbols / 2; index++) {
            currentSymbol = inputArr[index];
            symbols = symbols - 1;
            inputArr[index] = inputArr[symbols];
            inputArr[symbols] = currentSymbol;
        }

        for (int index = 0; index < inputArr.length; index++) {
            System.out.print(inputArr[index] + " ");
        }

    }
}
