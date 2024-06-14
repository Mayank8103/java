import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        b = sc.nextInt();

        System.out.println("Enter the value of c : ");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is greater...");
            }
            else{
                System.out.println("b is greater...");
            }
        }

        else{
            if(b>c){
                System.out.println("B is greater...");
            }
            else{
                System.out.println("C is greater...");
            }
        }
    }
}
