package com.company;

import java.util.Scanner;

class MyNegtiveException extends Exception{
    @Override
    public String toString() {
        return "radius  can not be negative";
    }

    @Override
    public String getMessage() {
        return "raduis can not be negative";
    }
}
public class CWS_throw_throws {
    public static double Area(int r) throws MyNegtiveException{
        if(r<0){
            throw new MyNegtiveException();
        }
        double result = Math.PI*r*r;
        return result;
    }
    public static int divide(int a , int b) throws ArithmeticException{
        int res = a/b;
        return res;
    }
    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("exception " + e);
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try{
            double d = Area(num);
            System.out.println(d);
        }
        catch (Exception e)
        {
            System.out.println("exception " + e);
            System.out.println(e.getMessage());
        }
    }
}
