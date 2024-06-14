import java.util.Scanner;

public class Even_Odd_Range {
    public static void main(String[] args) {
        int i,l;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial number to start print all even or odd number : ");
        i = sc.nextInt();
        System.out.println("Enter Last number where end printing the numbers : ");
        l = sc.nextInt();
        while(i<=l){
            if(i%2==0){
                System.out.println("Even number : "+i);
            }
            else{
                System.out.println("Odd number : "+i);
            }
            i++;
        }
    }
}
