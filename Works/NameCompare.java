public class NameCompare{
    public static void main(String[] args){
        String name1 = "ram";
        String name2 = "shyam";

        int ans = name1.compareTo(name2);
        String result = ( ans < 0 ) ? "Ram is grater":"Shyam is greater";
        System.out.println(result);
    }
}