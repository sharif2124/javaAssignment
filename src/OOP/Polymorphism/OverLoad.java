package OOP.Polymorphism;

public class OverLoad {
    void add(double a,double b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(){
        System.out.println("No Parameter Showing");
    }
}