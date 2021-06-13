import java.util.Scanner;
public class Income{
	public static void main(String[] args){
		Scanner scObj = new Scanner(System.in);
		System.out.println("Enter your income");
		double salary = scObj.nextInt();
		
		if (salary <= 250000){
			System.out.println("There is no tax for you");
		}
		else if(salary >= 250000 && salary <= 500000){
			System.out.println("The tax amount is: " +salary *0.05);
		}
		else if(salary >= 500000 && salary <= 750000){
			System.out.println("The tax amount is: " +salary * 0.20);
		}
		else if(salary >= 750000 && salary <= 1000000){
			System.out.println("The tax amount is: " +salary * 0.20);
		}
		else if(salary >= 1000000 && salary <= 1250000){
			System.out.println("The tax amount is: " +salary * 0.30);
		}
		else if(salary >= 1250000 && salary <= 1500000){
			System.out.println("The tax amount is: "+ salary * 0.30);
		}
		else if(salary > 1500000){
			System.out.println("The tax amount is: "+ salary * 0.30);
		}
				
	}
}	
