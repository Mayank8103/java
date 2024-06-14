import java.util.Scanner;

class SecondLastDigit{
	public static void main(String[] args){
		int n, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any above 3 digit number : ");
		n = sc.nextInt();
		
		res = (n/10)%10;
		
		System.out.println("The second last digit number is : "+res);
	}
}