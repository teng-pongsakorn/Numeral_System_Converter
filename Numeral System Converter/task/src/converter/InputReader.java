package converter;

import java.util.Scanner;

public class InputReader {

    private Scanner scanner = new Scanner(System.in);
    private int sourceRadix;
    private String sourceNumber;
    private int targetRadix;

    public boolean readAll() {
        try {
            sourceRadix = readRadix();
            sourceNumber = readNumberString();
            targetRadix = readRadix();
            return true;
        } catch (RuntimeException | AssertionError e) {
            System.out.println("error");
            return false;
        }

    }

    private String readNumberString() {
        String number = scanner.nextLine();
        validateNumberGivenRadix(number);
        return number;
    }

    private void validateNumberGivenRadix(String number) {
        if (number.matches("[a-zA-Z0-9]+\\.[a-zA-Z0-9]+")) {
            validateFractal(number);
        } else if (isOneBase(number)) {
            //
        } else {
            validateInteger(number);

        }
    }

    private void validateInteger(String number) {
        Integer.parseInt(number, sourceRadix);
    }

    private boolean isOneBase(String number) {
        return (number.matches("1+") && sourceRadix==1);
    }

    private void validateFractal(String number) {
        Integer.parseInt(number.split("\\.")[1], sourceRadix);
        Integer.parseInt(number.split("\\.")[0], sourceRadix);
    }

    private int readRadix() {
        int radix = Integer.parseInt(scanner.nextLine());
        validateRadix(radix);;
        return radix;
    }

    private void validateRadix(int radix) {
        assert radix >= 1 && radix <= 36;
    }


    public String getSourceNumber() {
        return sourceNumber;
    }

    public int getSourceRadix() {
        return sourceRadix;
    }

    public int getTargetRadix() {
        return targetRadix;
    }
}
