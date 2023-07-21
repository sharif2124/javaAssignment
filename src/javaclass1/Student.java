package javaclass1;

public class Student {

    int id ;
    String name;

    //create a Constuctors

    Student(int i ,String n){
        id = i;
        name = n;
    }

    //create method

    void display(){
        System.out.println("Id is :"+id);
        System.out.println("Name is :"+name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101,"Rahim");
        Student s2 = new Student(102,"Karim");

        //Calling display method

        s1.display();
        s2.display();
    }
}
