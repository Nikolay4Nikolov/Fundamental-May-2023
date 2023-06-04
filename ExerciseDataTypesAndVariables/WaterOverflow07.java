package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        for (int i = 1; i <= num; i++) {
            int liter = Integer.parseInt(scanner.nextLine());
            sum = sum + liter;
            if (sum > 255) {
                sum = sum - liter;
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(sum);
    }
}
