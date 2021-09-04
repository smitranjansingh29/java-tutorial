package com.company;
import java.util.Scanner;
public class cws_conditional {
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        int age = so.nextInt();
//        if(age>56)
//        {
//            System.out.println("you are experienced ");
//        }
//        else if (age>46)
//        {
//            System.out.println("you are less experienced");
//        }
//        else{
//            System.out.println("you are not experienced much");
//        }


        //switch

        switch (age) {
            case 18 -> System.out.println("you are an adult");
            case 21 -> System.out.println("you are going join a job");
            case 60 -> System.out.println("you are retired");
            default -> System.out.println("enjoy your life ");
        }
        System.out.println("thank code run");
    }
}

