package com.company;

import java.util.Locale;

public class method_string {
    public static void main(String[] args) {
        String name = "Smit";
        System.out.println(name);

        System.out.println(name.length());

        String str = name.toLowerCase();
        System.out.println(str);

        String str1 = name.toUpperCase();
        System.out.println(str1);

        String nonTrim = "  to harry ";
        System.out.println(nonTrim.trim());

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,3));

        System.out.println(name.replace('m','u'));
        System.out.println(name.replace("mi","us"));

        System.out.println(name.startsWith("Sm"));

        System.out.println(name.endsWith("it"));

        System.out.println(name.charAt(2));

        System.out.println(name.indexOf("m"));
        String str2 = "harryrry";
        System.out.println(str2.indexOf("rry",4));

        System.out.println(str2.lastIndexOf("rry"));
        System.out.println(str2.lastIndexOf("rry",7));

        System.out.println(name.equals("Smit"));
        System.out.println(name.equalsIgnoreCase("sMit"));

        //Escape sequenceing characacter

        System.out.println("my name is smit \" ranjan singh");
        System.out.println("my name is smit \n ranjan singh");
        System.out.println("my name is \t smit ");
        System.out.println("my name is \\ smit");


    }
}
