package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        double volume = 0;
        volume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", volume);


    }
}
