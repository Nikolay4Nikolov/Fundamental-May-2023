package DataTypesAndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte n = Byte.parseByte(scanner.nextLine());
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);

        }

        System.out.println(sum);

    }
}
