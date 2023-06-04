package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int student = Integer.parseInt(scanner.nextLine());
        double priceLightSaber = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double sumLightSaber = (Math.ceil(student * 1.1)) * priceLightSaber;
        double sumRobes = student * priceRobes;
        int freeBelt = student / 6;
        double sumBelts = (student - freeBelt) * priceBelts;

        double total = sumLightSaber + sumRobes + sumBelts;

        if (total <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - amountOfMoney);
        }


    }
}
