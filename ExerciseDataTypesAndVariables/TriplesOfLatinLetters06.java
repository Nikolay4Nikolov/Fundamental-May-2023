package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class TriplesOfLatinLetters06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num; i++) {
            char firstSymbol = (char) ('a' + i);
            for (int j = 0; j < num; j++) {
                char secondSymbol = (char) ('a' + j);
                for (int k = 0; k < num; k++) {
                    char thirdSymbol = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstSymbol, secondSymbol, thirdSymbol);
                }
            }
        }

    }
}
