package com.company;
import java.util.Scanner;
public class cbse_prercentage_cal {
    public static void main(String[] args){
     System.out.println("to calculate the percentage of class 12");
     Scanner so = new Scanner(System.in);
     System.out.println("enter first sub marks out of 100");
     int m1 = so.nextInt();
     System.out.println("enter second sub marks out of 100");
     int m2 = so.nextInt();
     System.out.println("enter third sub marks out of 100");
     int m3 = so.nextInt();
     System.out.println("enter fourth sub marks out of 100");
     int m4 = so.nextInt();
     System.out.println("enter fifth sub marks out of 100");
     int m5 = so.nextInt();
     int sum = m1 + m2 + m3 + m4 + m5;
        System.out.println("total marks of 500 : " + sum);
     float percentage = 100*(sum/500.0f);
        System.out.println(percentage);

    }
}
