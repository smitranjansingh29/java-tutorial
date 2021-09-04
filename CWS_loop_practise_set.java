package com.company;

public class CWS_loop_practise_set {
    public static void main(String[] args) {
//        problem1
//        int n =5;
//        for(int j = n ; j>=1;j--) {
//            for (int i = 1; i <= j; i++) {
//                System.out.print("* ");
//            }
//            System.out.print("\n");
//        }

        //problem 2

//        int n = 4;
//        int sum =0;
//        for(int i = 0 ; i<n;i++)
//        {
//            sum = sum + (i*2);
//        }
//        System.out.print(sum);



//        problem 3
        int n =10;
        int upto =10;
        int sum = 0;
        int output;
        for(int i=1 ; i<=2 ;i++ )
        {

            sum =sum+( n*i);
//            System.out.printf("%d * %d = ",n,i);
            System.out.println(sum);
        }

    }
}
