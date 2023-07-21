package student.hierarchicalInheritance;

public class Rectangle extends Shape{
    double length;
    double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;

    }

  double area(){
      System.out.println("Area of Rectangle : ");
      return length*width;
  }
}
