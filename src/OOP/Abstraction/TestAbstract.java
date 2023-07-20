package OOP.Abstraction;

public class TestAbstract {
    public static void main(String[] args) {
        MobileUser mu; //reference Variable

        mu= new Karim();
        mu.SenMessage();

        mu=new Rahim();
        mu.SenMessage();


    }
}
