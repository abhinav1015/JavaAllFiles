public class SmallesteArray {
    public static void main(String[] args){
        int[] numbers = {5,1,0,13,12};
        int smallest=numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<smallest){
                smallest = numbers[i]; 
            }
        }
        System.out.println(smallest);

    }
}
