package com.company;
class phone{
    public void name(){
        System.out.println("my name in java class 1");
    }
    public void greet(){
        System.out.println("good morning");
    }
}

class smartPhone extends phone{
    public void name(){
        System.out.println("my name is java class 2");
    }
    public void swagat(){
        System.out.println("apaka swagat hai");
    }

}
public class CWS_METHOD_DISPATCH {
    public static void main(String[] args) {
       // phone obj = new phone();
        //smartPhone smph = new smartPhone();
        //obj.name();

        // super class    sub class
        phone obj = new smartPhone(); //yes it is allowed
        //smartPhone obj1 = new phone();  //not allowed
        obj.name();
        obj.greet();

    }
}
