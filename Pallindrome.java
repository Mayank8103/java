import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,r,s=0,t;
        System.out.println("Enter the number to check it is palindrome or not : ");
        n = sc.nextInt();
        t=n;
        while (n!=0) {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if (s==t) {
            System.out.println("This given number is palindrome:");
        }
        else {
            System.out.println("NOT PALINDROME.........");
        }
    
    }
}
