import java.util.Scanner;
class EvenOrNot{
	public static void main(String[] args){
		int num ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number to find It's even or not");
		num = S.nextInt();
		
        String result = ((num / 2)*2 == num) ? "even" : "odd";
        System.out.println(num + " is " + result);
	}
}