package com.company;
interface camera{
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
interface wifi{
    public String[] getNetworks();
    void connecttonetwork(String network);
}

class mycellPhone{
    void callNumber(int phoneNumber){
        System.out.println("calling"+phoneNumber);
    }
    void pickCall(){
        System.out.println("connecting..");
    }
}

class mySmartPhone extends mycellPhone implements camera,wifi{
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
        return newtorklist;
    }

    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to " + network);
    }
}
public class CWS_default_methods {
    public static void main(String[] args) {
        mySmartPhone ms = new mySmartPhone();
        String [] arr = ms.getNetworks();
        for (String item:
             arr) {
            System.out.println(item);

        }
        ms.recor4kvideo();

        }

}
