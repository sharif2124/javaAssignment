package class5.abstraction;

public class AbstractionMain {
    public static void main(String[] args) {
        MobileUser mu;
        mu=new Kamal();
        mu.sendMessage();

        mu=new Jamal();
        mu.sendMessage();
    }
}
