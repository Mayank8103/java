public class Divisible3and5 {
    public static void main(String[] args) {
        int x,count=1;
        for(x=1;x<=1000;x++){
            if(count<=10){
                if(x%3==0 && x%5==0){
                    System.out.println(x);
                    count++;
                }
            }
            if(count==11){
                break;
            }
        }
        System.out.println("Last value of x :- "+x);
    }
}
