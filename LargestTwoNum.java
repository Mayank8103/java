import java.util.Scanner;

public class LargestTwoNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Enter first number : ");
        n1 = sc.nextInt();

        System.out.println("Enter Second number : ");
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.println("First number is greater then second number.......");
        }
        else{
            System.out.println("Second number is greater then first number");
        }
        System.out.println("Thank You........");
    }
}