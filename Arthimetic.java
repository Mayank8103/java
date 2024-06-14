import java.util.Scanner;

public class Arthimetic {
    public static void main(String[] args) {
        int a,b;
        char op;
        Scanner ob = new Scanner(System.in);
        System.out.println();
        System.out.println("enter the value of a ");
        a=ob.nextInt();
        System.out.println("enter the value of b,");
        b=ob.nextInt();
        System.out.println("enter any operator");
        op=ob.next().charAt(0);
        System.out.println("result ");

        switch (op) {
            case '+': System.out.println(a+b);
                break;

            case '/': System.out.println(a/+b);
                break;

            case '-': System.out.println(a-b);
                break;

            case '*':System.out.println(a*b);
                break;

        
        }

    }
    
}
