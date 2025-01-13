package MultiThreading;

public class Main {
    
    static class MyThread extends Thread{
        public void run(){
            System.out.println("thread is running...");
        }
    }

    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }

    static class MyThread extends Thread{
        public void run(){

            System.out.println("thread is running...");
        }
    }
}
