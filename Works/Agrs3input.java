public class Agrs3input {
    public static void main(String[] args){
        String argument1 = args[0];
        String argument2 = args[1];
        String argument3 = args[2];

        int a = Integer.parseInt(argument1);
        int b = Integer.parseInt(argument2);
        int c = Integer.parseInt(argument3);

        if(a > b && a>c){
            System.out.println(a +" is greater");

        }else if(b >c){
            System.out.println(b + " is greater");
        }sdaf
        else{
            System.out.println(c + " is greater");
        }
    }
}
