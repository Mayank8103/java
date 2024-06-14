public class SwapNum {
    public static void main(String[] args) {
        int num1 = 15, num2 = 20;

        //if we use third variable then
        // int temp = num1;
        // num1 = num2;
        // num2 = temp;
        
        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.println("Number 1 : "+num1+" Number 2 : "+num2);

    }
}