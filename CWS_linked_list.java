package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class CWS_linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>();
        LinkedList<Integer> L2 = new LinkedList<>();
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
        L1.addLast(44);
//        L1.addAll(0,L2);
        System.out.println(L1.indexOf(7));//2
//        System.out.println(L1.lastIndexOf(7));//2
//        System.out.println(L1.indexOf(96));  //-1
//        L1.clear();
        for (int i = 0 ; i< L1.size() ; i++) {
            System.out.print(L1.get(i));
            System.out.print(" , ");
        }
    }
}
