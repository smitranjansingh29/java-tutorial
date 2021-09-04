package com.company;

public class cws_ps3 {
    public static void main(String[] args) {
//        problem
        String letter = "dear name thanks a lot";
        letter = letter.replace("name","smit");
        System.out.println(letter);

//        problem to detect doubleand triple spacess
        String str = "string contain double  and triple   spaces";
        System.out.println(str.contains("  ") || str.contains("   "));
        System.out.println("my double index position " + str.indexOf("  "));
        System.out.println("my triple index position " + str.indexOf("   "));
    }
}
