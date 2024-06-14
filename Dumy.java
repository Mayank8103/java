class Dumy{
	public static void main(String[] args){
		int a = 10;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		int c=11;
		System.out.println(a);
		System.out.println(c);

		int d = ++a + b++ - --c - a++ - c--;
		System.out.println(d);
	}
}