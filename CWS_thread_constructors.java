package com.company;
class myThr extends Thread{
    public myThr(String name){
        super(name);
    }

    @Override
    public void run() {
        while (true)
        {
            System.out.println("i am a thread");
        }
    }
}
public class CWS_thread_constructors {
    public static void main(String[] args) {
        myThr t1 = new myThr("smit");
//        t1.start();
        System.out.println("id is  "+ t1.getId());
        System.out.println("name is  "+ t1.getName());

    }
}
