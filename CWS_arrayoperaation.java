package com.company;

public class CWS_arrayoperaation {
    public static void main(String[] args) {
        int [] marks = {23,45,24,66};
        float [] marks1 ={23.34f,76.22f,12.54f,76.45f,12.45f,95.25f};
        String [] marks2 = {"smit","rohan","amit"};
         System.out.println(marks.length);
         System.out.println(marks2.length);
        System.out.println(marks1[2]);
        System.out.println(marks2[1]);

        System.out.println("printing using for loop");
        for(int i = 0 ; i < marks.length ; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("printing in reverse order");
        for(int i = marks.length-1 ; i >=0 ; i--)
        {
            System.out.println(marks[i]);
        }

        System.out.println("for each loop in java");
        for (int element:marks){
            System.out.println(element);
        }



    }
}
