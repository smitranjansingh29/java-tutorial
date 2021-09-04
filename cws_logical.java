package com.company;

public class cws_logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
//        if(a && b && c)
//        {
//            System.out.println("y");
//        }
//        else {
//            System.out.println("n");
//        }

        if(a || b)
        {
            System.out.println("y");
        }
        else {
            System.out.println("n");
        }


        System.out.println("not a is " + !a);
        System.out.print("not b is " + !b);


    }
}
