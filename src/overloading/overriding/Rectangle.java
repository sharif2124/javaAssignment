package overloading.overriding;

public class Rectangle {
    double length;
    double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

    double area(){
        System.out.println("Area od Rectangle :");
        return length*width;
    }
}
