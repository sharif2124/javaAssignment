package OOP.Polymorphism.OverridingPart2;

public class Triangle extends Shape{
    //area

    double height;
    double base;

    Triangle(double height,double base){
        this.height=height;
        this.base=base;
    }

   double area(){
       System.out.println("Area of Triangle :");
        return 0.5*base*height;
   }
}
