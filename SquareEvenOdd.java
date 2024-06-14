import java.util.Scanner;

public class SquareEvenOdd {
    public static void main(String[] args){
        int n, sq;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find the square and check whether even or not : ");
        n = sc.nextInt();

        sq = n * n;
        String res = (sq % 2 == 0) ? "Yes it is even" : "No it is not even";
        System.out.println(sq+" and "+res);
    }
}