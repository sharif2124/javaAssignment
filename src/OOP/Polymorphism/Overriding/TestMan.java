package OOP.Polymorphism.Overriding;

public class TestMan {
    public static void main(String[] args) {
        Man p = new Man();
        p.display();

        //object er method ke use korchi p
        p= new Student();
        p.display();
    }
}
