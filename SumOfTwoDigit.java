import java.util.Scanner;

public class SumOfTwoDigit {
    public static void main(String[] args){
        int n1, n2, sum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any three digit First number : ");
        n1 = sc.nextInt();

        System.out.println("Enter any three digit Second number : ");
        n2 = sc.nextInt();

        sum = (n1 % 10) + (n2 % 10);
        System.out.println("Output : "+sum);
    }
}