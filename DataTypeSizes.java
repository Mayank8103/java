public class DataTypeSizes {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Data Type\tSize (bytes)\tMin. Value\t\tMax. Value");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("byte\t\t" + Byte.SIZE+"\t\t"+ Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        System.out.println("short\t\t" + Short.SIZE+"\t\t"+ Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        System.out.println("int\t\t" + Integer.SIZE+"\t\t"+ Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        System.out.println("long\t\t" + Long.SIZE+"\t\t"+ Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        System.out.println("float\t\t" + Float.SIZE+"\t\t"+ Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        System.out.println("double\t\t" + Double.SIZE+"\t\t"+ Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
        System.out.println("char\t\t" + Character.SIZE);
        System.out.println("------------------------------------------------------------------------------");

	// System.out.println(); This will run
	// System.out.print(); This will produce compile time error.
        // System.out.println("boolean\t\t" + Byte.SIZE+"\t\t"+ Byte.MIN_VALUE + "\t\t" + Byte.MAX_VALUE); 
	// Technically, boolean size is JVM dependent
    }
}