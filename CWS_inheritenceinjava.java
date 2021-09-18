package com.company;
interface sample{
    void meth1();
    void meth2();

}
interface childSample extends sample{
    void meth3();
    void meth4();

}

class mySampleclass implements childSample{
    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }
}
public class CWS_inheritenceinjava {
    public static void main(String[] args) {
        mySampleclass sc = new mySampleclass();
        sc.meth1();
        sc.meth2();
        sc.meth3();
        sc.meth4();
    }
}
