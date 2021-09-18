package com.company;
interface camera2{
    public void takeSnap();
    public void recordVideo();
    private void greet(){
        System.out.println("good morning ");
    }
    default public void recor4kvideo(){
        greet();
        System.out.println("record 4k video");
    }

}
interface wifi2{
    public String[] getNetworks();
    void connecttonetwork(String network);
}

class mycellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..");
    }
}

class mySmartPhone2 extends mycellPhone2 implements camera2,wifi2{
    @Override
    public void takeSnap() {
        System.out.println("taking the snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("record the video");
    }

//    @Override
//    public void recor4kvideo() {
//        System.out.println("taking sanp");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("getting the networks");
        String [] newtorklist = {"harry","prashanth"};
        return newtorklist;}

    public void samplemeth3(){
            System.out.println("meth");
    }


    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to " + network);
    }
}
public class CWS_polymorphism_interfaces {
    public static void main(String[] args) {
        camera2 cam1 = new mySmartPhone2(); // this is a smartphone use it asa camera
        //cam1.getNetworks(); // it is not allowed
        cam1.recor4kvideo();
        mySmartPhone2 s = new mySmartPhone2(); // now weuse all the method

    }
}
