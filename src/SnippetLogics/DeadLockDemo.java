package SnippetLogics;

/**
 * DEADLOCK happens while doing a multitasking (like Multi Threading)
 * This happens where a THREAD T1 waits for object lock holding by another THREAD T2
 */
public class DeadLockDemo{

    static class threadClass1 implements Runnable{

        public void run(){
            synchronized (String.class){
                System.out.println("Got lock on threadClass1 String class--> ::" + Thread.currentThread().getName());
            }
            synchronized (Integer.class){
                System.out.println("Got lock on threadClass1 Integer class--> ::" + Thread.currentThread().getName());
            }
        }


    }

    static class threadClass2 implements Runnable {

        @Override
        public void run() {
            synchronized (Integer.class){
                System.out.println("Got lock on threadClass2 Integer class--> ::" + Thread.currentThread().getName());
            }
            synchronized (String.class){
                System.out.println("Got lock on threadClass2 String class--> ::" + Thread.currentThread().getName());
            }

        }
    }

    public static void main(String[] args) {
       /* new Thread(threadClass1,String).start();
        new Thread(threadClass2,Integer).start();*/
        //Logger L = new Logger(DeadLockDemo.class);

        System.out.println("Calling both the Threads in MAIN method ::");

        new Thread(new threadClass1(),"Thread ONE").start();
        new Thread(new threadClass2(), "Thread TWO").start();

        System.out.println("Calling is DONE !!!!!!! ");
    }


}
