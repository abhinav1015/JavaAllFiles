class Thread1 extends Thread{
    @Override
    public void run(){
       
        while (true){
            System.out.println("Hello I am Thread1");
            System.out.println("------------------");
            
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
     
        while(true){
            System.out.println("------------------------");
            System.out.println("Hello I am Thread2");
       
        }
    }
}

public class ThreadingDemo1{
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        t1.start();
        Thread2 t2 = new Thread2();
        t2.start();
    }
}