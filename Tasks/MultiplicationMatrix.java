
public class MultiplicationMatrix {
    public static void main(String[] args){
        
        int[][] matrix1 = {{1,2},{3,4}};
        int[][] matrix2 = {{1,2},{3,4}};
        
        int[][] storeAnswer = new int[2][2];  
         System.out.println("The addtion of matrix is: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                storeAnswer[i][j] = matrix1[i][j] * matrix2[i][j]; 
                System.out.print(storeAnswer[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
