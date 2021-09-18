package com.company;
class myThr2 extends Thread{

    @Override
    public void run() {
        int i = 0;
        while (i<34)
        {
            System.out.println("thank you t1 ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class myThr3 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i<34)
        {
            System.out.println("thank you t2" );
            i++;
        }
    }
}
public class CWS_thread_methods {
    public static void main(String[] args) {
        myThr2 t1 = new myThr2();
        myThr3 t2 = new myThr3();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        t2.start();

    }
}
