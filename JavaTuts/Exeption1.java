import java.util.Scanner;

public class Exeption1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println("Division of " + a + " and " + b + " is " + c);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
            System.out.println(e.getMessage());
        }
        System.out.println("Hellos");
        sc.close();
    }
}