package converter;

public class Main {
    public static void main(String[] args) {

        int decimal = 10;
        System.out.printf("%d = %s", decimal, DecimalConverter.toBinaryString(decimal));
    }
}
