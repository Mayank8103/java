import java.util.Scanner;

public class FirstSecondThird{
    public static void main(String[] args) {
        int x, y, z, res;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any three digit number 1 : ");
        x = sc.nextInt();

        System.out.println("Enter any three digit number 2 : ");
        y = sc.nextInt();

        System.out.println("Enter any three digit number 3 : ");
        z = sc.nextInt();

        res = ((x%10)*100) + (((y/10)%10)*10) + (z/100);
        System.out.println(res);
    }
}