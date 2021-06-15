import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        if(number1 >= 0){
            switch (number1) {
                case 0:
                    System.out.println("This a zero");
                    break;
                default:
                    System.out.println("This is a positive number");
            }
        }else{
            System.out.println("negative");
        }
        sc.close();
    }
}
