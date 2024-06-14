import java.util.Scanner;

public class PrimeNumGivenRange {
    public static void main(String[] args) {
        int i, l, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        i = sc.nextInt();
        System.out.println("Enter the Last value : ");
        l = sc.nextInt();

        // while(i<=l){
        // x=1;
        // while(x<=i/2){
        // if(i%x==0){
        // //System.out.println("n");
        // break;
        // }
        // x++;
        // if(x>i/2){
        // System.out.println(i);
        // }
        // }
        // i++;
        // }
        // }
        while (i <= l) {
            int count = 2;
            int factor = 2;
            if (i > 1) {
                while (factor <= i / 2) {
                    if (i % factor == 0) {
                        // System.out.println("Factors of " + i + " " + factor);
                        count++;
                    }
                    factor++;
                    // System.out.println("count is "+count);
                }
                if (count == 2) {
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
