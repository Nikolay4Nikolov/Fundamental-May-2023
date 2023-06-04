package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPass = scanner.nextLine();

        if (!isValidNumbersCharacters(inputPass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistLetterDigit(inputPass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!twoDigit(inputPass)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidNumbersCharacters(inputPass) && consistLetterDigit(inputPass) && twoDigit(inputPass)) {
            System.out.println("Password is valid");
        }

    }
    public static boolean isValidNumbersCharacters (String characters) {
        boolean isValid = false;
        if (characters.length() >= 6 && characters.length() <= 10) {
            isValid = true;
        } else {
            isValid = false;
        }
        return isValid;
    }

    public static boolean consistLetterDigit (String letterDigit) {
        boolean consist = false;
        for (int index = 0; index <= letterDigit.length() - 1; index++) {
            if (Character.isLetterOrDigit(letterDigit.charAt(index))) {
                consist = true;
            } else {
                consist = false;
                break;
            }
        }
        return consist;
    }

    public static boolean twoDigit (String twoDigit){
        int count = 0;
        for (int index = 0; index <= twoDigit.length() - 1; index++) {
            if (Character.isDigit(twoDigit.charAt(index))) {
                count++;
            }
        }
        boolean isHaveTwoDigit = false;
        if (count >= 2) {
            isHaveTwoDigit = true;
        } else {
            isHaveTwoDigit = false;
        }
        return isHaveTwoDigit;
    }

}

