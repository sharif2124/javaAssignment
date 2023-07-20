package class6part1.generic;

public class WrapperClass {
    public static void main(String[] args) {
        //autoboxing
        //primitive->object

        int x=30;
        Integer y = Integer.valueOf(x);
        System.out.println("Y = "+y);

        //2nd method

        int z= x; // Integer.valueOf(x) autoboxing
        System.out.println("Z = "+z);

        //unboxing
        //object->primitive datatype

        Double d = new Double(10.20);
        System.out.println("Value of D : "+d);

        double e = Double.valueOf(d);
        System.out.println("Vale of of E : "+e);
    }
}
