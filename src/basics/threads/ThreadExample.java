package basics.threads;

import java.util.Vector;

import static java.lang.Thread.sleep;

public class ThreadExample extends Thread {
    //Producer putMessage, getMessage
    //Consumer
    //run
    //start
    //notify
    //init the size
    //using vector for messages

    private static int MAX = 9;

    Vector messages = new Vector();


    public void run() {
        try {
            while (true) {
                //    notify();

                System.out.println("Send the transaction :");
                putMessages();
                wait(1000);

            }
        } catch (InterruptedException e) {
            System.out.println("Consider a logger here :" + e);
            e.printStackTrace();
        }
    }

    public synchronized void putMessages() throws InterruptedException {
        try {
            while (messages.size() == MAX) {
                wait();

                messages.addElement(new java.util.Date().toString());
                notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Vector getMessages() {
        while (messages.size() == MAX) {
            // notify();
            String getCallMsg = (String) messages.firstElement();
            System.out.println("I got the message :" + messages);
            // messages.addElement(new java.util.Date().toString());

            messages.removeElement(getCallMsg);

            return messages;

        }
        return null;
    }
}

class Consumer extends ThreadExample {
    public ThreadExample threadExample;

    public Consumer(ThreadExample p) {
        this.threadExample = p;
    }

    @Override
    public void run() {
        //notify();
        try {
            while (true) {
                Vector mes = threadExample.getMessages();
                System.out.println("Here I got the message :" + mes);
                sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        ThreadExample tprod = new ThreadExample();
        tprod.start();
        new Consumer(tprod).start();
    }
}

