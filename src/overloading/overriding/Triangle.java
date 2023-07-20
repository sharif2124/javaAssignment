package overloading.overriding;

public class Triangle {
    double base;
    double height;

    Triangle(double base,double height){
        this.base=base;
        this.height=height;

    }

    double area(){
        System.out.println("Area of Triangle :");
        return 0.5*base*height;
    }
}
