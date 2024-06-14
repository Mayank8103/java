import java.util.Scanner;

public class TwoNumEqual {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("Enter first number : ");
        n1 = sc.nextInt();

        System.out.println("Enter Second number : ");
        n2 = sc.nextInt();

        if(n1>n2){
            System.out.println("Brother...");
        }
        else if(n1<n2){
            System.out.println("Sister...");
        }
        else if(n1==n2){
            System.out.println("Wins...");
        }
        System.out.println("Thank You........");
    }
}
