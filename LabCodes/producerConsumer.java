import java.util.*;
class Pc1{
    LinkedList<Integer> list=new LinkedList<>();
    int capacity=5;
    public void produce() throws Exception{
        int value=0;
        while(true){ 
            synchronized(this){
                while(list.size()==capacity){
                    wait();
                }
                System.out.println("Producer is going to produce: "+value);
                list.add(value++);
                notify();
                Thread.sleep(500);
            }
        }
    }
    public void consume() throws Exception{
        while(true){ 
            synchronized(this){
                while(list.size()==0){
                    wait();
                }
                System.out.println("Consumer is going to Consume: "+list.removeFirst());
                notify();
                Thread.sleep(500);
            }
        }
    }
}

class A extends Thread{
    Pc1 p;
    public A(Pc1 p){
        this.p=p;
    }
    public void run(){
        try{
            p.produce();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

class B extends Thread{
    Pc1 p;
    public B(Pc1 p){
        this.p=p;
    }
    public void run(){
        try{
            p.consume();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

public class producerConsumer{
    public static void main(String[] args) throws InterruptedException{
        Pc1 p=new Pc1();
        A t1=new A(p);
        B t2=new B(p);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}