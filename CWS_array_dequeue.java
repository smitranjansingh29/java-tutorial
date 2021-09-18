package com.company;

import java.util.ArrayDeque;

public class CWS_array_dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(7);
        ad1.add(8);
        ad1.addFirst(4);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

    }
}
