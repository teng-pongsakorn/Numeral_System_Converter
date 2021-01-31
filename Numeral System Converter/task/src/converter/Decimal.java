package converter;


public class Decimal {

    public static String toRadixInteger(int number, int radix) {
        return isRadixOne(radix) ? "1".repeat(number) : Integer.toString(number, radix);
    }

    private static boolean isRadixOne(int radix) {
        return radix == 1;
    }

    public static String toRadixFractal(double number, int radix) {
        int numFloatPoint = 5;
        String result = "";
        int intPart;
        for (int i = 0; i < numFloatPoint; i++) {
            number *= radix;
            intPart = (int) number;
            number -= intPart;
            result += Integer.toString(intPart, radix);
        }
        return result;
    }
}
