package com.company;

class employee{
    int id;
    String name;
    int salary;

    public void printDetails() {
        System.out.println("my id is : "+id);
        System.out.println("my name is : " + name);
    }

    public int getSalary(){
        return salary;
//        System.out.println(salary);
    }
}
public class CWS_custom_class {
    public static void main(String[] args) {
        employee smit = new employee();//instantiating a new employee object
        employee harry = new employee();
        //setting attibutes
        smit.id = 12;
        smit.salary = 30000;
        smit.name = "smit";

        //printing the attributes
        //System.out.println(smit.id);
        //System.out.println(smit.name);
        smit.printDetails();

        harry.id = 14;
        harry.salary=46789;
        harry.name = "harry tripathi";

        harry.printDetails();
        harry.getSalary();

        //int salary = harry.getSalary();
        //System.out.println(salary);
    }
}
