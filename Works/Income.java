import java.util.Scanner;
public class Income {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income: ");
        double income = sc.nextDouble();
        if (income > 100000){
            double taxamt = income * 0.15;
            income = income - taxamt;
            System.out.println("Your tax amount is: "+ taxamt);
            System.out.println("Your tax after tax reduction is: " + income);
        }else if(income < 100000){
            double taxamt = income * 0.05;
            income = income - taxamt;
            System.out.println("Your tax amount is: "+ taxamt);
            System.out.println("Your tax after tax reduction is: " + income);
        }
        sc.close();
    }
}
