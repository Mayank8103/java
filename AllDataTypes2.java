import java.util.Scanner;

class AllDataTypes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();

        System.out.print("Enter a byte number (-128 to 127) : ");
        byte byteValue = scanner.nextByte();

        System.out.print("Enter a Short number (-32768 to 32767) : ");
        short shortValue = scanner.nextShort();

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();

        System.out.print("Enter a float number (Decimal value) : ");
        float floatValue = scanner.nextFloat();

        System.out.print("Enter a double (Any decimal value): ");
        double doubleValue = scanner.nextDouble();

        System.out.print("Enter a long number (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807): ");
        long longValue = scanner.nextLong();

        Scanner stringScanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String stringValue = stringScanner.nextLine();

        System.out.print("Enter a character: ");
        char charValue = stringScanner.next().charAt(0);

        scanner.close();
        stringScanner.close();

        System.out.println();
        System.out.println("Boolean: " + booleanValue);
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Integer: " + intValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Long: " + longValue);
        System.out.println("String: " + stringValue);
        System.out.println("Character: " + charValue);

    }
}