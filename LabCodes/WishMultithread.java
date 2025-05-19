class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
        setName(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " executed " + i);
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Thread " + name + " was interrupted.");
                return;
            }
        }
    }
}

public class WishMultithread {
    public static void main(String[] args) {
        MyThread csThread = new MyThread("CSthread");
        MyThread itThread = new MyThread("ITthread");
        csThread.start();
        itThread.start();
    }
}
