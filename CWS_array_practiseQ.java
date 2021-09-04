package com.company;

public class CWS_array_practiseQ {
    public static void main(String[] args) {
        //problem 1 : create an array of 5 floats and calculate their sum

        /*float[] marks = {23.6f,45.67f,54.34f,54.87f,48.51f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("the total of sum is "+sum);

         */

        //pro 2: wap to find out whether a given integer is present in an array or not
//        float[] marks = {23.6f,45.67f,54.34f,54.87f,48.51f};
//        float num = 23.6f;
//        boolean isinarray = false;
//        for(float element:marks){
//            if(num==element)
//            {
//                isinarray = true;
//                break;
//            }
//        }
//        if(isinarray){
//            System.out.println("element is present in the array");
//        }
//        else {
//            System.out.println("element is not present in the array");
//        }

        //pro 3 : cal the average marks from the array containing marks of all students in phy using for loop
//        same as problem 2

        //pro 4 : create a java program to add two matrics of size 2 x 3
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{1,1,3},
                         {5,9,6}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        for (int i=0 ; i< mat1.length ; i++ )
        {
            for(int j=0 ; j< mat1[i].length;j++)
            {
                System.out.printf("setting up the value for i=%d and j=%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        for (int i=0 ; i< mat1.length ; i++ )
        {
            for(int j=0 ; j< mat1[i].length;j++)
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println(" ");
        }

        //pro 5 : write a java program to reverse a array
        //pro 6 : write a java program to find the maximum element in an array
        //pro 7 : wa java program to find the muximum element in a java array
        //pro 8 : write a java program to find whether an array is sorted or not

    }
}
