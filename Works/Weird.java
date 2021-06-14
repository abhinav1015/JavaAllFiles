public class Weird {
    public static void main(String[] args){
        int number = 3;
        if(number % 2 != 0){
            if(number >= 1 && number <= 4){
                System.out.println("Not Wierd");
            }
            else if(number < 6 && number > 4){
                System.out.println("Not Wierd");
            }else if(number < 10 && number >= 6){
                System.out.println("wierd");
            }
        }else{
            System.out.println("Invalid Number");
        }
    }
}
