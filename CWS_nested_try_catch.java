package com.company;
import java.util.*;
public class CWS_nested_try_catch {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 98;
        marks[1] = 56;
        marks[2] = 34;
        marks[3] = 40;
        marks[4] = 92;
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            int ind = sc.nextInt();
            try {
                System.out.println("welcome to video no 82");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry entered index is out of bound : " + e);
                    System.out.println("exception in level2");
                }
            } catch (Exception e) {
                System.out.println("enception in level 1");
            }
        }
        System.out.println("thank you ");
    }
}
