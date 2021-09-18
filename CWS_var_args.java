package com.company;

public class CWS_var_args {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a ,int b ,int c){
//        return  a+b+c;
//    }
    static int sum(int ...arr){
        int result=0;
        for(int element:arr){
            result = result + element;
        }
        return result;

    }static int sum1(int x,int ...arr){
        int result=x;
        for(int element:arr){
            result = result + element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome to var args  ");
        System.out.println("sum of 4, 5 is : "+ sum(4,5));
        System.out.println("sum of 4, 5, 6 is : "+ sum(4,5, 6));
        System.out.println("sum of nothing : "+ sum());
        System.out.println("sum of nothing : "+ sum1(1));
    }
}
