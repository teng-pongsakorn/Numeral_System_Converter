package converter;


public class Decimal {
    public static String toRadix(int decimal, int radix) {
        assert radix >= 1 && radix <= 36;
        if (radix == 1) {
            return convertToRadixOne(decimal);
        }
        return Integer.toString(decimal, radix);
    }

    private static String convertToRadixOne(int number) {
       return "1".repeat(number);
    }
}