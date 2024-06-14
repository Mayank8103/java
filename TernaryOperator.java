import java.util.Scanner;
class TernaryOperator{
	public static void main(String[] args){
		int number ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a numb");
		number = S.nextInt();
		
        String result = ((number & 1) == 0) ? "even" : "odd";
        System.out.println(number + " is " + result);
	}
}