package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a constructor");
    }
}

class derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class CWS_inheritence {
    public static void main(String[] args) {
//        Base smit = new Base();
//        smit.setX(45);
//        System.out.println(smit.getX());

        derived smit = new derived();
        smit.setX(67);
        System.out.println(smit.getX());



    }
}
