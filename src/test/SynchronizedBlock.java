package test;

class Incrementer{

    private int c = 0;

    public void inc(){

        // Synchronize only this block
        synchronized (this) { c++; }
    }

    public int get() { return c; }
}

public class SynchronizedBlock {

    public static void main(String[] args)
            throws InterruptedException{

        Incrementer cnt = new Incrementer();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
                cnt.inc();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Counter: " + cnt.get());
    }
}
