public class PercentageDemo {
    public static void main(String[] args){
        final int percent80 = 80;
        final int percent60 = 60;
        final int percent50 = 50;
        final int percent40 = 40;
        int percentage = 75;
        if(percentage >= percent80){
            System.out.println("Distinction");
        }else if(percentage <= percent80 && percentage >= percent60){
            System.out.println("First Divison");
        }else if(percentage >= percent50 && percentage <= percent60){
            System.out.println("Second Divison");
        }else if(percentage >= percent40 &&  percentage <= percent50){
            System.out.println("Third Division");

        }else{
            System.out.println("Fail");
        }
    }
}
Hello
