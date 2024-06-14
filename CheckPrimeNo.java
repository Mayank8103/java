import java.util.Scanner;

public class CheckPrimeNo {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether the number is prime or not : ");
        i=sc.nextInt();
        if(i>1){
        for(int x=2;x<i/2;x++){
            if(i%x==0){
            System.out.println("It is not prime");
            return;
            }
        }
        System.out.println("This is prime");
    }
    else{
        System.out.println("Invalid input....");
    }
    }
}
