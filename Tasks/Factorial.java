public class Factorial{
    public int fact(int a){
        int factnum = 1;
        for(int i=2;i<=a;i++){
            factnum = factnum * i;
        }
        return factnum;
        // System.out.println("The factorial of "+ a + " is " + factnum);
    }
    public static void main(String[] args){
            Factorial factObj = new Factorial();
            System.out.println(factObj.fact(6));
    }
}