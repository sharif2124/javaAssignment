package student.Inheritance.singleInheritance;

public class Athlete {
    String name;
    int age;

    private int ducks;

   public int getDucks(){
       return ducks;
   }

   public void setDucks(int ducks){
       this.ducks=ducks;
   }
    void display1(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }
}
