public class SumArray {
    public static void main(String[] args){
        int numbers[] = {34,5,12,13,45};
        int total = 0;
        for(int i=0;i<numbers.length;i++){
            total = total + numbers[i];
        }
        System.out.println(total);
    }
}
