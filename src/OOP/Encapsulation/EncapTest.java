package OOP.Encapsulation;

public class EncapTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Karim");
        p1.setAge(26);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }
}
