import java.util.Scanner;

class BookDetail{
	public static void main(String[] args){
		String name, author;
		int price;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Book : ");
		name = sc.nextLine();
		
		System.out.println("Enter the author name of "+name+" Book : ");
		author = sc.nextLine();
		
		System.out.println("Enter the price of "+name+" Book : ");
		price = sc.nextInt();
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("Name : "+name);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price+"$");
	}
}