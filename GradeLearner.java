import java.util.Scanner;

public class GradeLearner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks;
        
        System.out.println("Enter Your Marks number : ");
        marks = sc.nextInt();

        // System.out.println("Enter Second number : ");
        // n2 = sc.nextInt();

        if(marks>90 && marks<=100){
            System.out.println("Outstanding");
        }
        else if(marks>80 && marks<=90){
            System.out.println("A+");
        }
        else if(marks>70 && marks<=80){
            System.out.println("A");
        }
        else if(marks>60 && marks<=70){
            System.out.println("B+");
        }
        else if(marks>50 && marks<=60){
            System.out.println("A");
        }
        else if(marks<50){
            System.out.println("Fail..");
        }
        System.out.println("Thank You........");
    }
}
