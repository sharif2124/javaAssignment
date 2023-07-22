package class5;

public class OverLoad {
    public void add(double a, double b){
        System.out.println("Summation of A and B :"+(a+b));
    }

    public void add(double a, double b, double c){
        System.out.println("Summation of A,B And C :"+(a+b+c));

    }
    void add(){
        System.out.println("No Parameter Showing");
    }
}
