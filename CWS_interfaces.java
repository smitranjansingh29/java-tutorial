package com.company;
interface Bicycle{
    int a =45;
    void applyBrake(int decrement);
    void speedUp(int increment );
}
interface myBicycle{
    void pushBrake(int decre);
    void pullBrake(int incre);
}
class avonCycle implements Bicycle,myBicycle{
    public int a = 444; // it is possible
    void blowHorn(){
        System.out.println("pee poo");
    }

    @Override
    public void applyBrake(int decrement) {
        System.out.println("decrese the speed by "+ decrement);
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("incre the speed");
    }

    @Override
    public void pullBrake(int incre) {
        System.out.println("incre the speeed");
    }

    @Override
    public void pushBrake(int decre) {
        System.out.println("decers the speed");
    }
}
public class CWS_interfaces {
    public static void main(String[] args) {
        avonCycle smit = new avonCycle();
        smit.applyBrake(3);
        System.out.println(smit.a);
        //you can not modify the properties in interfaces as they are final
        //smit.a= 455; it is not possilble
        smit.pullBrake(4);
        smit.pushBrake(5);
        Bicycle b = new avonCycle();
        b.applyBrake(4);

    }
}
