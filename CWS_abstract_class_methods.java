package com.company;
 abstract class Parent2{
    public Parent2(){
        System.out.println("i am constructor");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();


}

class Child2 extends Parent2{
     @Override
     public void greet(){
         System.out.println("good morning ");
     }
     @Override
    public void greet2(){
         System.out.println("good afternoon");
     }
}
abstract class Child3 extends Parent2{
    @Override
    public void greet(){
        System.out.println("i am good");
    }
    @Override
    public void greet2(){
        System.out.println("i good afternoon");
    }

}
public class CWS_abstract_class_methods {
    public static void main(String[] args) {
       // Parent2   p = new Parent2(); //not possible
        Child2 c = new Child2(); // possible
        }
    }
