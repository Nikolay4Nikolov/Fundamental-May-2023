package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double number = Double.MIN_VALUE;
        String biggestKeg = "";

        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = 3.14 * radius * radius * height;

            if (volume > number) {
                number = volume;
                biggestKeg = name;
            }
        }
            System.out.println(biggestKeg);
    }
}
