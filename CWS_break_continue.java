package com.company;

public class CWS_break_continue {
    public static void main(String[] args) {
//        for(int i =0; i<5 ; i++)
//        {
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//        }
//        int i = 0;
//        do {
//            System.out.println(i);
//            if(i==2){
//                System.out.println("ending the loop");
//                break;
//            }
//            i++;
//        }
//        while (i<5);
//        System.out.println(i);
//        System.out.println("loop end here");


        for(int i =0 ;i<5 ;i++)
        {
            if(i==2)
            {
//                System.out.println("stop the loop");
                continue;
            }
            System.out.println(i);
        }
    }
}
