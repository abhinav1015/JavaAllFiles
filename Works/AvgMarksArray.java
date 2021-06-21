public class AvgMarksArray {
    public static void main(String[] args){
        int[] marks = {20,30,40,50,20,40,20,50};
        double totalMarks=0;
        for(int i =0;i<marks.length;i++){
            totalMarks= totalMarks + marks[i];
        }
        System.out.println(totalMarks/8);
    }
}
