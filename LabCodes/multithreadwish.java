class Display{
    public void wish(String str){
        try{
        Thread.sleep(500);
        System.out.print(s);
    }
        catch(InterruptedException e){
            e.printStackTrace();
            throw e;
        }
        System.out.println("Hello, "+str);
    }
}
class ThreadWish extends Thread {
    public void run(){
        Display display = new Display();
        display.wish(str:"XYZ");
    }

    public static void main(String[] args) {
        ThreadWish thread = new ThreadWish();
        thread.start();
    }
}

class wishmultithread{
    public static void main(String[] args) {
        ThreadedWish thread1 = new ThreadedWish1();
        ThreadedWish thread2 = new ThreadedWish2();
        thread1.start();
        thread2.start();
    }
}

