package test;


class Counter{

    private int counter = 0;


    public synchronized void increment(){

        counter++;
    }

    public synchronized int get(){
        return counter;
    }
}
public class Synchronized {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Thread thread1 = new Thread(
                () -> {
                    for(int i = 0; i < 1000;i++){
                        counter.increment();
                    }
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    for(int i = 0; i < 1000;i++){
                        counter.increment();
                    }
                }
        );

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + counter.get());

    }
}
