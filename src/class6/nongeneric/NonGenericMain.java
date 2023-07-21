package class6.nongeneric;

public class NonGenericMain {
    public static void main(String[] args) {
        IntegerTest integerTest = new IntegerTest(30);
        System.out.println("Area of Rectangle : "+integerTest.getRectangle());

        FloatTest floatTest = new FloatTest(40.0f);
        System.out.println("Area of Triangle : "+floatTest.getTriangle());

        DoubleTest doubleTest = new DoubleTest(25.00);
        System.out.println("Area of Circle : "+doubleTest.getCircle());
    }
}
