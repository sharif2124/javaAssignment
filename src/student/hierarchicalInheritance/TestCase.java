package student.hierarchicalInheritance;

public class TestCase {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(4.5,7.8);
        Triangle t = new Triangle(5.6,3.7);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
