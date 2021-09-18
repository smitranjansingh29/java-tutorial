package com.company;

public class CWS_method {
    static void telljoke(){
        System.out.println("i invented a new record");
    }
    static int logic(int x , int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
//        int a=5;
//        int b=7;
//        int c;
//        c = logic(a,b);
//        System.out.println(c);
        int a1=5;
        int b1=7;
        int c1;
        CWS_method obj = new CWS_method();
        c1 = obj.logic(a1,b1);
        System.out.println(c1);

    }
}
