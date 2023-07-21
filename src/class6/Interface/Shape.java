package class6.Interface;

public interface Shape {
    void area();

    default void circleArea(){
        System.out.println("CircleArea : "+(3.1416*5*5));
        rhombus();
    }

    static double Rectangle(double length){
        return length*length;
    }

    private void rhombus(){
        System.out.println("Diagonal of Rhombus : "+(2 * 54)/6);
    }
}
