import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num, result;
        
        System.out.println("Enter first number : ");
        num = sc.nextInt();

        result = num%10;
        System.out.println(result);
    }
}
