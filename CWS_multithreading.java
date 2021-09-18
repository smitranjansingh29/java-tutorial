package com.company;
/*
class myThread1 extends Thread{
    public int i=0;
    @Override
    public void run(){
        while (i<100) {
            System.out.println("i am happy ");
            System.out.println("i am cooking");
            i++;
        }
    }
}
class myThread2 extends Thread{
    public int i = 0;
    @Override
    public void run(){
        while (i<100) {
            System.out.println("i am happy ");
            System.out.println("i am chatting");
            i++;
        }
    }
}
public class CWS_multithreading {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}
*/

class myThreadrunable1 implements Runnable{
    @Override
    public void run() {
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
        System.out.println("i am runnable thread 1");
    }
}
class mythreadrunable2 implements Runnable{
    @Override
    public void run(){
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
        System.out.println("i am runnable thread 2");
    }
}
public class CWS_multithreading {
    public static void main(String[] args) {
        myThreadrunable1 bullet1 = new myThreadrunable1();
        Thread gun1 = new Thread(bullet1);

        mythreadrunable2 bullet2 = new mythreadrunable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}