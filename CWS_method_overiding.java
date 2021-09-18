package com.company;
class A {
    public int a;

    public int harry() {
        return 4;
    }

    public void meth() {
        System.out.println("i am second method");
    }
}
    class B extends A {
    @Override //recommended when doing over ride the methods
    public void meth(){
        System.out.println("i am over ride method");
    }
        public void meth2() {
            System.out.println("i am b method");
        }
    }
    public class CWS_method_overiding {
        public static void main(String[] args) {
            A a = new A();
            a.meth();

            B b = new B();
            b.meth();
        }
    }