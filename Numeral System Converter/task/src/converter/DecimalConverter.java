package converter;

public class DecimalConverter {

    public static String toBinaryString(int decimal) {
        String result = "";
        while (decimal > 0) {
            result = getBinaryRemainder(decimal) + result;
            decimal /= 2;
        }
        result = addBinaryPrefix(result);
        return result;
    }

    private static String addBinaryPrefix(String result) {
        return "0b" + result;
    }

    private static int getBinaryRemainder(int decimal) {
        return decimal % 2;
    }
}
