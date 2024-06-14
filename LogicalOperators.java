import java.util.Scanner;
class LogicalOperators{
	public static void main(String[] args){
		boolean n1,n2;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number : ");
		n1 = S.nextBoolean();
		System.out.println("Enter a 2nd number : ");
		n2 = S.nextBoolean();
		
        boolean x = n1 && n2;
        System.out.println("The output for AND operator && is : "+x);
		
		x = n1 || n2;
		System.out.println("The output for OR operator || is : "+x);
		
		x = ! n1;
		System.out.println("The output for NOT operator ! is : "+x);
	}
}