import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num,m,a=0,temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether the number is armstrong or not : ");
        num = sc.nextInt();
        int ov = num;
        while(num > 0){
            m = num%10;
            a = a+(m*m*m);
            //temp = temp + a;
            num = num/10;
        }
        if(ov == a){
            System.out.println("This number is Armstrong....");
        }
        else {
            System.out.println("The given number is not Armstrong number....");
        }
    }
}
