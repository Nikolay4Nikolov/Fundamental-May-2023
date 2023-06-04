package Methods;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int inputNumber = Integer.parseInt(scanner.nextLine());

        printString(inputString, inputNumber);
    }
    public static void printString (String string, int num) {
        for (int index = 0; index < num; index++) {
            System.out.print(string + "");
        }
    }
}
