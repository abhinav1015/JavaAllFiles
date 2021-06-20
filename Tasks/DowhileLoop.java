import java.util.Scanner;
public class DowhileLoop{
   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result = "n";
        do{
            System.out.println("Please enter your percentage: ");
            int percentage = sc.nextInt();
            // sc.nextInt();
            System.out.println("Please enter your symbol Num: ");
            int symbol = sc.nextInt();
            if(percentage >= 90){
                System.out.println("Your symbol is "+ symbol + " and grade is A+++");
            }
            if(percentage >= 70 && percentage <= 90){
                System.out.println("Your symbol is "+ symbol + " and grade is A++");
            }
            if(percentage >= 50 && percentage <=70){
                System.out.println("Your symbol is "+ symbol + " and grade is A+");
            }
            if(percentage >= 0 && percentage <= 50){
                System.out.println("Your symbol is "+ symbol + " and grade is A+++");
            }
            // sc.nextInt();
            System.out.println("Do you want to continue(y/n): ");
            result = sc.next();
            
            
        }while(result.equals("y"));

    }
}