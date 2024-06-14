import java.util.Scanner;
class AllDataTypes{
	public static void main(String[] args){
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = Scanner.nextBoolean();
		
		System.out.print("Enter a byte number (-128 to 127) : ");
        byte byteValue = Scanner.nextByte();
		
		System.out.print("Enter a Short number (-32768 to 32767) : ");
        short shortValue = Scanner.nextShort();
		
		System.out.print("Enter an integer: ");
        int intValue = Scanner.nextInt();
		
		System.out.print("Enter a float number (Decimal value) : ");
        float floatValue = Scanner.nextFloat();

        System.out.print("Enter a double (Any decimal value): ");
        double doubleValue = Scanner.nextDouble();
		
		System.out.print("Enter a long number (-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807): ");
        long longValue = Scanner.nextLong();

        Scanner.nextLine(); // How to fix this without using this line (scanner.nextLine())
        System.out.print("Enter a string: ");
        String stringValue = Scanner.nextLine();

        System.out.print("Enter a character: ");
        char charValue = Scanner.next().charAt(0);


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