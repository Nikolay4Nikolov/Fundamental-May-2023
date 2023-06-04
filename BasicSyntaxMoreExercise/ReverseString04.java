package BasicSyntaxMoreExercise;

import java.util.Scanner;

public class ReverseString04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        for (int i = word.length() - 1; i >= 0; i--) {
            char currentPosition = word.charAt(i);
            System.out.print(currentPosition);
        }

    }
}
