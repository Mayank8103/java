class Sample2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		int c = a++ + b++ - b-- - ++a;
		System.out.println(c);
	}
}
