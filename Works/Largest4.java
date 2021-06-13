public class Largest4{
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int large;
		large = (a>b && a>c && a>d)? a:((b>c && b>d)?b:(c>d ? c:d));
		System.out.println("largest number among" + a + " ," + b + "," + c + "and" + d + " is "+ large + ".");
	}
}	
