import java.util.Scanner;

class DivisibleBySix{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check whether the number is divisible by 6 or not : ");
		n = sc.nextInt();
		
		String res = ((n/6)*6 == n) ? "Yes it is divisible by 6." : "No Given number is not divisible by 6.";
		System.out.println(res);
	}
}