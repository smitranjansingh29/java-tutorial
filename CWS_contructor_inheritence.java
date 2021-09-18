package com.company;
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int x){
        System.out.println("i am overloaded constructor " + x);
    }

}
class derived1 extends base1{
    derived1(){
//        super(0);
        System.out.println("i am derived constructor");
    }
    derived1(int x , int y){
        super(7);
        System.out.println("iam overloaded derived constructor  "+y);
    }

}class childOfDerived extends derived1{
    childOfDerived(){
//        super(0);
        System.out.println("i am child derived constructor");
    }
    childOfDerived(int x , int y , int z){
        super(x, y);
        System.out.println("iam overloaded child derived constructor  "+z);
    }

}
public class CWS_contructor_inheritence {
    public static void main(String[] args) {
//        base1 smit = new base1();
//        System.out.println(smit);
//        derived1 d =new derived1();
        derived1 d =new derived1(0,9);
//        childOfDerived cd =  new childOfDerived(4,5,6);


    }
}
