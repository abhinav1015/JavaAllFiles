public class Palindrome {
    public String palinLogic(String s){
        StringBuilder strObj = new StringBuilder(s);
        StringBuilder reversedString = strObj.reverse();
        int result = s.compareTo(reversedString.toString());
        if(result == 0){
            return "This is palindrome";
        }else{
            return "This is not palindrome";
        }
    }
    public static void main(String[] args){
        Palindrome palinObj = new Palindrome();
        System.out.println(palinObj.palinLogic("vrav"));
    }
}
