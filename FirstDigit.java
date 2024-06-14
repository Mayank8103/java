import java.util.Scanner;

class FirstDigit{
	public static void main(String[] args){
		int n, res;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any three digit number : ");
		n = sc.nextInt();
		
		res = n/100;
		System.out.println(res);
	}
}