package com.company;
class  myMainEmployee{
    private int id;
    private String name;

//    public myMainEmployee()      //construtor
//    {
//        id = 45;
//        name = "your name";
//    }
    public myMainEmployee(String myName , int n1){   //different way to use construtor 21
        id = n1;
        name = myName;
    }
    public String getName(){
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        this.id = i;
    }
}
public class CWS_constructors {
    public static void main(String[] args) {
        myMainEmployee smit = new myMainEmployee("code with smit",43);//21 using in this way
//        smit.setId(34);
//        smit.setName("smitranjan");
        System.out.println(smit.getId());
        System.out.println(smit.getName());
    }
}
