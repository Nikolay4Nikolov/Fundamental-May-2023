package ExerciseArrays;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class TreasureHunt_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String treasureLoot = scanner.nextLine();
        int count = 0;
        String[] treasureChest = treasureLoot.split("\\|");
        double average = 0;

        while (!treasureLoot.equals("Yohoho!")) {
            String[] commandArr = treasureLoot.split(" ");

            if (commandArr[0].equals("Loot")) {
                for (int i = 1; i < commandArr.length; i++) {
                    boolean alreadyContained = false;
                    for (int j = 0; j < treasureChest.length; j++) {
                        if (commandArr[i].equals(treasureChest[j])) {
                            alreadyContained = true;
                            break;
                        }
                    }
                    if (!alreadyContained) {
                        String newChest = commandArr[i] + " " + String.join(" ", treasureChest);
                        treasureChest = newChest.split(" ");
                    }
                }

            } else if (commandArr[0].equals("Drop")) {
                int position = Integer.parseInt(commandArr[1]);
                if (position >= 0 || position <= treasureChest.length - 1) {
                    String dropItem = treasureChest[position];
                    for (int index = position; index < treasureChest.length - 1; index++) {
                        treasureChest[index] = treasureChest[index + 1];
                        treasureChest[treasureChest.length - 1] = dropItem;
                    }
                }

            } else if (commandArr[0].equals("Steal")) {
                String stealCount = commandArr[1];
                int countSteal = Integer.parseInt(stealCount);
                if (countSteal <= treasureChest.length) {
                    for (int index = 0; index < countSteal; index++) {
                        for (int i = 0; i < treasureChest.length - countSteal; i++) {
                            String lastTreasure = treasureChest[index] + " ";
                            treasureChest = lastTreasure.split(" ");
                        }
                    }
                } else {
                    treasureChest = new String[0];
                }
            }

            for (int index = 0; index < treasureChest.length; index++) {
                count++;
            }

            average = 1.0 * count / treasureChest.length;
            treasureLoot = scanner.nextLine();

        }
        if (count > 0) {
            System.out.println(Arrays.toString(treasureChest));
            System.out.printf("Average treasure gain: %.2f pirate credits.\n", average);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
