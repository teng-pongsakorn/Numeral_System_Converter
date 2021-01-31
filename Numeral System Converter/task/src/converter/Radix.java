package converter;

abstract public class Radix {
    final int radix;
    final String numRadix;
    String decimalString;

    public Radix(String numRadix, int radix) {
        assert 1 <= radix && radix <= 36;
        this.numRadix = numRadix;
        this.radix = radix;
        this.decimalString = toDecimal();
    }

    abstract String toDecimal();

    boolean isBaseOne() {
        return radix == 1;
    }

    public String getStringDecimal() {return decimalString;}

}


class RadixInteger extends Radix {

    public RadixInteger(String number, int radix) {
        super(number, radix);
    }

    @Override
    public String toDecimal() {
        return isBaseOne() ? numRadix.length() + "" : Integer.parseInt(numRadix, radix) + "";
    }

    public int getNumDecimal() {
        return Integer.parseInt(decimalString);
    }
}

class RadixFractal extends Radix {

    public RadixFractal(String number, int radix) {
        super(number, radix);
    }

    @Override
    public String toDecimal() {
        try {
            return isBaseOne() ? numRadix.length() + "" : computeFractal();
        } catch (IndexOutOfBoundsException e) {
            return "";   // no fractal case
        }
    }

    public double getNumDecimal() {
        return Double.parseDouble("0." + decimalString);
    }

    private String computeFractal() {
        double base = radix;
        double frac = 0;
        for (char c: numRadix.toCharArray()) {
            frac += Integer.parseInt(c+"", radix) / base;
            base *= radix;
        }
        return (frac + "").split("\\.")[1];
    }
}