package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class PokeMon10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustionFactory = Integer.parseInt(scanner.nextLine());
        int countPoke = 0;
        int isExhausted = power / 2;

        while (power >= distance) {
            power = power - distance;
            countPoke++;
            if (power == isExhausted) {
                if (exhaustionFactory != 0) {
                    power = power / exhaustionFactory;
                }
            }
        }

        System.out.println(power);
        System.out.println(countPoke);

    }
}
