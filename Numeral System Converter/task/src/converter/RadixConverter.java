package converter;

public class RadixConverter {
    int radix;
    String number;
    RadixInteger integerPart;
    RadixFractal fractalPart;

    public RadixConverter(String number, int radix) {
        this.radix = radix;
        setIntegerAndFractal(number);
    }

    private void setIntegerAndFractal(String number) {
        this.number = number;
        if (hasFractal()) {
            String[] nums = number.split("\\.");
            integerPart = new RadixInteger(nums[0], radix);
            fractalPart = new RadixFractal(nums[1], radix);
        } else {
            integerPart = new RadixInteger(number, radix);
            fractalPart = new RadixFractal("", radix);
        }
    }

    private boolean hasFractal() {
        return number.matches("[0-9a-zA-Z]+\\.[0-9a-zA-Z]+");
    }

    public String convert(int otherRadix) {
        int decimalIntPart = integerPart.getNumDecimal();
        double decimalFractalPart = fractalPart.getNumDecimal();
        return Decimal.toRadixInteger(decimalIntPart, otherRadix) +
                "." + Decimal.toRadixFractal(decimalFractalPart, otherRadix);
    }
}


