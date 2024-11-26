package MultiThreading;

public class Main {
    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.run();
        thread2.run();
    }

    static class MyThread extends Thread{
        public void run(){

            System.out.println("thread is running...");
        }
    }
}
