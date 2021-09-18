package com.company;
class myThr1 extends Thread{
    public myThr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i<34)
        {
            System.out.println("thank you " + this.getName());
            i++;
        }
    }
}
public class CWS_thread_priorities {
    public static void main(String[] args) {
        myThr1 t1 = new myThr1("smit1");
        myThr1 t2 = new myThr1("smit2");
        myThr1 t3 = new myThr1("smit3");
        myThr1 t4 = new myThr1("smit4 most important");
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
