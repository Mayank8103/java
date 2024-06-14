import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        //int a;
        char Vo;

       
        Scanner ob=new Scanner(System.in);
        System.out.println("enter two numbers ");
        Vo=ob.next().charAt(0);
        switch (Vo) {
            

            case 'A'  : System.out.println("vowel");
                
                break;
            case 'E' : System.out.println("vowel");
                break;

            case 'I' : System.out.println("vowel");
                break;
            case 'O' : System.out.println("vowel");
                break;        
            case 'U'  : System.out.println("vowel");
                break;
                default: System.out.println("consonent");
            break;
        }

    }
}
