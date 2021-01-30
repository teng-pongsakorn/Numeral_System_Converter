package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // get inputs
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String sourceNumber = intToString(scanner.nextInt());
        int targetRadix = scanner.nextInt();

        // process input
        int sourceDecimal = Radix.toDecimal(sourceNumber, sourceRadix);

        String targetNumber = Decimal.toRadix(sourceDecimal, targetRadix);

        System.out.println(targetNumber);
    }

    private static String intToString(int num) {
        return num + "";
    }
}
