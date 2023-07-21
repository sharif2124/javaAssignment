package OOP.Polymorphism.OverridingPart2;

public class Rectangle extends Shape{
    //area

    double length;
    double width;

    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }

   double area(){
       System.out.println("Area of Rectangle :");
        return  length * width;
   }
}
