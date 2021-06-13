public class Grocery{
	public static void main(String[] args){
		float age = 21;
		String gender = "male";
		double purchase = 2000;
		double discount1 =(float) purchase * 0.10;
		double discount2 =(float) purchase * 0.03;
		double Total1 = (int) purchase - discount1;
		double Total2 = (int) purchase - discount2;	
		System.out.println( (age < 18 && gender == "male")? ("You bought "+ Total1) :("You bought " +  Total2));
		
	}
}
