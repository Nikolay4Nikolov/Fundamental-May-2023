package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Snowballs11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountBalls = Integer.parseInt(scanner.nextLine());
        long lastValue = Integer.MIN_VALUE;
        int snow = 0;
        int time = 0;
        int quality = 0;

        for (int i = 1; i <= amountBalls; i++) {
            int ballSnow = Integer.parseInt(scanner.nextLine());
            int ballTime = Integer.parseInt(scanner.nextLine());
            int ballQuality = Integer.parseInt(scanner.nextLine());

            long value = (long) Math.pow ((ballSnow / ballTime) , ballQuality);

            if (value > lastValue) {
                lastValue = value;
                snow = ballSnow;
                time = ballTime;
                quality = ballQuality;
            }
        }

        System.out.printf("%d : %d = %d (%d)", snow, time, lastValue, quality);

    }
}
