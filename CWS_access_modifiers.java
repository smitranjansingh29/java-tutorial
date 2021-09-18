package com.company;

import org.w3c.dom.ls.LSOutput;

class c1{
    public int a = 34;
    protected int b = 33;
    int c = 6;
    private int d = 45;

    public void meth1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    class c2 extends c1{

    }
}
public class CWS_access_modifiers {
    public static void main(String[] args) {
        c1 x = new c1();
        x.meth1();
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.c);
//        System.out.println(x.d); not possible


    }
}
