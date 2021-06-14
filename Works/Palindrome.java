

public class Palindrome{
    public static void main(String[] args){
        String name = "brb";
        StringBuilder strObj1 = new StringBuilder(name);
        // StringBuilder strObj2 = new StringBuilder();

        StringBuilder str1 = strObj1.reverse();
        System.out.println(str1);
        
    //    String result = (name.equals(str1)) ? "Palindrome":"Not Palindrome";
       // System.out.println(result);
    }
}