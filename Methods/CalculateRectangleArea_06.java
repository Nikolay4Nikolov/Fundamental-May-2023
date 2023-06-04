package Methods;

import java.util.Scanner;

public class CalculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inputWidth = Double.parseDouble(scanner.nextLine());
        double inputHeight = Double.parseDouble(scanner.nextLine());

        double area = rectangleArea(inputWidth, inputHeight);
        System.out.println(area);

    }

    public static double rectangleArea (double width, double height) {

        return width * height;
    }
}
