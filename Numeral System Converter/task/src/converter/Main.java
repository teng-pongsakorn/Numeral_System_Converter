package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // get inputs
        Scanner scanner = new Scanner(System.in);
        int sourceRadix = scanner.nextInt();
        String sourceNumber = scanner.next().trim();
        int targetRadix = scanner.nextInt();

        RadixConverter radixConverter = new RadixConverter(sourceNumber, sourceRadix);
        System.out.println(radixConverter.convert(targetRadix));
    }
}
