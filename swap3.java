public class swap3{
	public static void main(String[] args){
		int a = 5; int b = 10;
		a = a^b;
		b = b^a;
		a = b^a;
		System.out.printf("3. a = %d and b = %d", a, b);


		
	}
}