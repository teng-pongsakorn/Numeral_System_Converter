package converter;

public class Main {
    public static void main(String[] args) {

        InputReader reader = new InputReader();
        boolean validInput = reader.readAll();
        if (validInput) {
            RadixConverter radixConverter = new RadixConverter(reader.getSourceNumber(), reader.getSourceRadix());
            System.out.println(radixConverter.convert(reader.getTargetRadix()));
        }
    }
}
