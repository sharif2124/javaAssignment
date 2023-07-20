package OOP.Interface;

public class Dog implements Animal{


    @Override
    public void eat() {
        System.out.println("Dog Can eat meat");
    }

    @Override
    public void run() {
        System.out.println("Dog Can run");
    }
}
