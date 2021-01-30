package converter;

public class Radix {
    public static int toDecimal(String number, int radix) {
        assert radix >= 1 && radix <= 36;
        if (radix == 1) {
            return radixOneToDecimal(number);
        }
        return Integer.parseInt(number, radix);
    }

    private static int radixOneToDecimal(String number) {
        return number.length();
    }
}