package com.company;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "i am toString()";
    }

    @Override
    public String getMessage() {
        return "i am get message()";
    }
}

class MyAgeException extends Exception{
    @Override
    public String toString() {
        return "not more than 125";
    }

    @Override
    public String getMessage() {
        return "make sure you enter write age";
    }
}
public class CWS_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<99)
        {
            try {
//                throw new MyException();
                throw new MyAgeException();
//                throw new ArithmeticException("this ia an exception");
            }
            catch (MyAgeException e)
            {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();

            }
        }
    }
}
