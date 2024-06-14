import java.util.Scanner;

public class CheckTwoVal {
    public static void main(String[] args) {
        int marks;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks : ");
        marks = sc.nextInt();

        if(marks>0 && marks<=100){
            switch (marks/10) {
                case 10:
                case 9:
                    System.out.println("outstanding");
                    break;

                case 8:
                    System.out.println("A+");
                    break;

                case 7:
                System.out.println("A");
                break;

                case 6:
                System.out.println("B+");
                break;

                case 5:
                System.out.println("B");
                break;

                case 3:
                case 2:
                case 1:
                System.out.println("Fail");
                break;
            }
        }
        else{
            System.out.println("Please enter correct marks...");
        }
    }
}