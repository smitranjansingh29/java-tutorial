package com.company;
class  myEmployee{
    private int id;
    private String name;

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
public class CWS_aceess_modifies {
    public static void main(String[] args) {
        myEmployee smit = new myEmployee();
        smit.setName("smit ranjan");
        System.out.println(smit.getName());
        smit.setId(56);
        System.out.println(smit.getId());

    }
}
