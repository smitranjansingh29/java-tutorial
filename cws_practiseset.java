package com.company;
import java.util.Scanner;
public class cws_practiseset {
    public static void main(String[] args) {
        System.out.println("practise set");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter phy marks");
        int m1 = sc.nextInt();
        System.out.println("enter che marks");
        int m2 = sc.nextInt();
        System.out.println("enter maths marks");
        int m3 = sc.nextInt();

        float avg = ((m1+m2+m3)/300f)*100;
        System.out.println(avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33)
        {
            System.out.println("congrtas you promoted");
            System.out.printf( "you get %.2f " , avg );
        }
        else{
            System.out.println("sorry you fail the exam try again");
        }

    }
}
