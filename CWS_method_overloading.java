package com.company;

public class CWS_method_overloading {
    static void foo(){
        System.out.println("good mornig");
    }
    static void foo(int a ){
        System.out.println("good morning "+a);
    }
    static void foo(int a,int b)
    {
        System.out.println("good morning "+ a +" and "+ b);
    }
//    static void change(int [] arr)
//    {
//        arr[0] = 45;
//    }
//    static void telljoke(){
//        System.out.println("you are such an idiot");
//    }
    public static void main(String[] args) {
//        telljoke();
//        int [] marks = {56,23,87,67};
//        change(marks);
//        System.out.println(marks[0]);
        foo();
        foo(3000);
        foo(20,90);

    }
}
