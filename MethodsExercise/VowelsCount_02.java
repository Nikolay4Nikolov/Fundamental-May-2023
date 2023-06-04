package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        containVowels(text);

    }
    public static void containVowels (String input) {
        int countVowel = 0;
        for (char symbol : input.toCharArray()) {
            boolean isVowel = symbol == 'a' || symbol == 'e'
                    || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'A'
                    || symbol == 'E' || symbol == 'I' || symbol == 'O' || symbol == 'U';
            if (isVowel) {
                countVowel++;
            }
        }
        System.out.println(countVowel);
    }
}
