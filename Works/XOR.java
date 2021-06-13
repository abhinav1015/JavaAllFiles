public class XOR{
	public static void main(String[] args){
		int a = 20;
		int b = 10;
		
		a= a^b;
		b=a^b;
		a=a^b;

		System.out.println("Value of a is: " + a);
		System.out.println("Value of b is: " + b);

	}
}

