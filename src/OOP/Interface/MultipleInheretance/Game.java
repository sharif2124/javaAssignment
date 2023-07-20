package OOP.Interface.MultipleInheretance;

public class Game implements Rahim,Karim {
    @Override
    public void play() {
        System.out.println("Rahim Play Cricket");
        System.out.println("Karim Play Football");
    }
}
