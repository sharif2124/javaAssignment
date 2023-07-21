package class6.Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.area();

        Shape sp = new Triangle();
        sp.circleArea();

        System.out.println("Area of Rectangle : "+Shape.Rectangle(10.20));

    }
}
