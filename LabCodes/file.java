java.util.*;
public class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("From thread 1="+i);
            try {
                Thread.sleep(500);
            } catch ( InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    
}

public class file{
    public static void main(String[] args) throws InterruptedException{
        A t1=new A();
        t1.run();
        t1.join(1600);
    }
}
