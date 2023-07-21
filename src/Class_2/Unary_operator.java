package Class_2;

public class Unary_operator {
    public static void main(String[] args) {
        int a = 30;
        System.out.println(a++);//30 post increment
        System.out.println(a);//31
        System.out.println(++a);//32 pre increment

        System.out.println(a--);//32 post decrement
        System.out.println(a);//31
        System.out.println(--a);//30 pre decrement

    }
}
