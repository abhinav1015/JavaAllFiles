public class ArrayPractice1 {
    public static void main(String[] args){
        int[] taxRate = {10,20,30,40,50,70,15};
        
        System.out.println("The tax rate of 7 different counries are as follows: ");
        for(int i=0;i<taxRate.length;i++){
            System.out.println(taxRate[i]+"%");
        }
    }
}
