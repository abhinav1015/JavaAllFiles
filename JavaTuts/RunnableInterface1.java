class Runnable1 implements Runnable{
    @Override
    public void run(){
        int i=0;
        while(i<=1000000){
            System.out.println("Hello I am thread1!!!!");
            i--;
        }
    }
}
class Runnable2 implements Runnable{
    @Override
    public void run(){
        int i =0;
        while(i<=999999){
            System.out.println("Hello I am thread2!!!");
            i--;
        }
    }
}
public class RunnableInterface1 {
    public static void main(String[] args){
        Runnable1 run1 = new Runnable1();
        Runnable2 run2 = new Runnable2();
        Thread th1 = new Thread(run1);
        
        Thread th2 = new Thread(run2);
        th1.start();
        th2.start();
    }
}
