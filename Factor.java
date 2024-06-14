import java.util.Scanner;
class Factor{
	public static void main(String[] args){
		int num ;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num = S.nextInt();
		
        String result = (24 % num == 0) ? " a factor of 24" : " not a factor of 24";
        System.out.println(num + " is " + result);
	}
}