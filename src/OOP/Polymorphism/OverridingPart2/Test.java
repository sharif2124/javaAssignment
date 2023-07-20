package OOP.Polymorphism.OverridingPart2;

public class Test {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(4.5,3.2);
        Triangle t = new Triangle(3.5,5.0);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());
    }
}
