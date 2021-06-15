public class SwitchMarks {
    public static void main(String[] args){
        int percent = 55;
        switch (percent) {
            case  100:
            case 90:
            case 80:
                System.out.println("Distinction");
                break;
            case 70:
            case 60:
                System.out.print("First Divison");
                break;
            case 50:
            case 40:
                System.out.println("Second Division");
                break;
            case 30:
                System.out.println("Third Division");
                break;
            default:
                System.out.println("Pass");
                break;
        }
    }
}
