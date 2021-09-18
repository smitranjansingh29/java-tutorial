package com.company;

public class CWS_recursion {
    static int factorial(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static int factorial_intearative(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        else {
            int product = 1;
            for(int i = 1 ; i<= n;i++)
            {
                product = product *i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(factorial(n));
        System.out.println(factorial_intearative(n));
    }
}
