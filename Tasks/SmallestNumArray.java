import java.util.Arrays;
public class SmallestNumArray {
    public int SmallestNumLogic(int num[]){
        Arrays.sort(num);
        int smallest = num[0];
        return smallest;
    }
    public static void main(String[] args){
        int[] num = {23,12,34,5,43,9};
        SmallestNumArray smallestNumArrayObj = new SmallestNumArray();
        System.out.println(smallestNumArrayObj.SmallestNumLogic(num));     

    }
}
