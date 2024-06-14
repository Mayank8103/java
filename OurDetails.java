import java.util.Scanner;
class OurDetails{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a Your Name: ");
        String name = scanner.nextLine();
		
		System.out.print("Enter your age : ");
        int age = scanner.nextInt();
		
		System.out.print("Enter your Mobile No. : ");
        long phone = scanner.nextLong();

        System.out.print("Enter a character: ");
        char gender = scanner.next().charAt(0);


        System.out.println();
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Mobile no. : " + phone);
        System.out.println("Gender : " + gender);
        
	}
}