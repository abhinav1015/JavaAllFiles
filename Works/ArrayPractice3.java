import java.util.Scanner;
public class ArrayPractice3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter 10 alphabets");
        
        for(int i=0;i<10;i++){
            names[i] = sc.nextLine();
        }
        
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                if(names[i].compareTo(names[j])>0){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }

            }
        }

        for(int i=0;i<10;i++){
            System.out.print(names[i] + "  ");
        }
        sc.close();
    }
}
