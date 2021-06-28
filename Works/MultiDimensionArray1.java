public class MultiDimensionArray1 {
    public static void main(String[] args){
        int[][] numbers = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[0].length;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
