import java.util.Scanner;
public class MultiplicationTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int entered = sc.nextInt();
		
		System.out.println("Multiplication table " + entered + " is:");
		for (int i = 0; i <= 10; i++){
			System.out.println(entered + " x "+ i + " = " + entered * i);
		}
	}
}


		
