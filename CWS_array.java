package com.company;

public class CWS_array {
    public static void main(String[] args) {
        /*
        class of 500 student want store marks of these 500 students
        you have two ways
        1. create 500 variables
        2. use arrays
        */

        //int [] marks = new int[5]; //array is created

        int [] marks;    // declaration + memory allocation
        marks = new int[5];

       // int [] marks = {12,34,23,56}; //third way decalre and initialize
        marks[0] = 70;
        marks[1] = 50;
        marks[2] = 40;
        System.out.println(marks[1]);
        System.out.println(marks[2]);



    }
}
