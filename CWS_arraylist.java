package com.company;
import java.util.*;

public class CWS_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> L2 = new ArrayList<>(5);
        L1.add(6);
        L1.add(7);
        L1.add(8);
        L1.add(9);
        L1.add(0,1);
        L2.add(15);
        L2.add(34);
        L2.add(76);
        L2.add(78);
        L2.add(29);
        L2.set(1,50);
        L1.addAll(L2);
//        L1.addAll(0,L2);
        System.out.println(L1.indexOf(7));//2
//        System.out.println(L1.lastIndexOf(7));//2
//        System.out.println(L1.indexOf(96));  //-1
//        L1.clear();
        for (int i = 0 ; i< L1.size() ; i++) {
            System.out.print(L1.get(i));
            System.out.print(" , ");
        }
        System.out.println(L1.contains(76));

    }
}
