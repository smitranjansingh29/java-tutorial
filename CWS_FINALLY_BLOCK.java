package com.company;

public class CWS_FINALLY_BLOCK {
    public static int greet(){
        try{
            int a= 50;
            int b= 2;
            int c = a/b;
            return c ;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("this is the end of this function ");
        }
        return 0;
    }
    public static void main(String[] args) {
        int d = greet();
        System.out.println(d);

        try{
            System.out.println(5/0);
        }
        finally {
            System.out.println("this is possible");
        }

    }
}
