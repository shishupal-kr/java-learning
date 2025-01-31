package OOPS.multithreading;


public class Main{
    static class MyThread implements Runnable{

        public void run(){
            System.out.println("Gun firing...");
        }
        public void fire(){
            System.out.println("Gun is Fired...");
        }
    }
    public static void main(String[] args){

        MyThread bullet1 = new MyThread();
        Thread gun1 = new Thread(bullet1);

        MyThread bullet2 = new MyThread();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        bullet1.fire();
        bullet2.fire();

    }
}