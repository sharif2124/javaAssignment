package overloading.overriding;

public class PolymorphismOverridingMain {
    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(10.00,4.00);
        Triangle t = new Triangle(20.00,5.00);

        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());

    }
}
