package com.company;
class ekClass{
    public int a ;

    public int getA() {
        return a;
    }

    ekClass(int v){
       this.a=v;
        System.out.println("ekclass ka constructor hu " + a);
    }
    public int returnone(){
        return 1;
    }
}
class doClass extends ekClass{
    doClass(int c)
    {
        super(c);
        System.out.println("mein do class ka constructor hu");
    }
}
public class CWS_THIS_SUPER {
    public static void main(String[] args) {
//        ekClass so = new ekClass(5);
//        System.out.println(so.getA());
        doClass sk = new doClass(5);

    }
}
