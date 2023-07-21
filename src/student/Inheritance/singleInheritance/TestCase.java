package student.Inheritance.singleInheritance;

public class TestCase {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        c1.name="Shakib Al Hasan";
        c1.age=36;
        c1.Qualification="All Rounder";
        c1.setDucks(25);

        c1.display2();
        System.out.println("Ducks : "+c1.getDucks());

    }


}
