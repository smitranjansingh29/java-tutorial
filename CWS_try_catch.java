package com.company;

import java.util.Scanner;

public class CWS_try_catch {
    public static void main(String[] args) {
//        int a = 6000;
//        int b = 0 ;
//        //without using try catch
////        int c = a/b;
////        System.out.println(c);
////
//        //using try catch
//        try {
//            int c = a/b;
//            System.out.println(c);
//        }
//        catch (Exception e){
//            System.out.println("we failed to divide "+e);
//        }
//

//        Handling specific exception
        int [] marks = new int[5];
        marks[0] = 98;
        marks[1] = 56;
        marks[2] = 34;
        marks[3] = 40;
        marks[4] = 92;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array index");
        int number = sc.nextInt();

        System.out.println("enter the number which you want to divide with");
        int divide = sc.nextInt();
        try{
            System.out.println("the value of " + marks[number]);
            System.out.println("the value after dividing " + marks[number]/divide);
        }
        catch (ArithmeticException e)
        {
            System.out.println("not possible due to "+ e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("not possible due to array "+ e);
        }
        catch (Exception e)
        {
            System.out.println("not possible due to unknown "+ e);
        }


    }
}
