import java.util.Scanner;

public class Square{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find square : ");
		long x=sc.nextLong();
		
		long res = x*x;
		System.out.println("The value of "+x+" is : "+res);
	}
}