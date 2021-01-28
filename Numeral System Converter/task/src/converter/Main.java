package converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = scanner.nextInt();
//        System.out.printf("%d = %s", decimal, DecimalConverter.toBinaryString(decimal));
        System.out.println(decimal % 8);
    }
}
