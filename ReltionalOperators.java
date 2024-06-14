//bitwise oprator helps in manipulating bit position of a given number.
// types of bitwise operator// AND(&) // OR(!) // XOR(^) // NOT(~) // Left-shift(<<) // Right-shift(>>)

import java.util.Scanner;
class ReltionalOperators{
	public static void main(String[] args){
		int n1,n2;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n1 = S.nextInt();
		System.out.println("Enter a 2nd number : ");
		n2 = S.nextInt();
		
		System.out.println();
		
        int x = n1 & n2;
        System.out.println("The output for AND operator && is : "+x);
		
		x = n1 | n2;
		System.out.println("The output for OR operator || is : "+x);
		
		x = n1 ^ n2;
		System.out.println("The output for XOR operator ^ is : "+x);
		
		x = (~ n2);
		System.out.println("The output for NOT operator ~ is : "+x);
		
		x = (n1 << n2);
		System.out.println("The output for LEFT-SHIFT operator << is : "+x);
		
		x = (n1 >> n2);
		System.out.println("The output for RIGHT-SHIFT operator >> is : "+x);
	}
}