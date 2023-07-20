package OOP.Interface;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat Can eat meat");
    }

    @Override
    public void run() {
        System.out.println("Cat can run");
    }
}
