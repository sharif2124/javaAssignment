package Class_2;

public class Relational_Operator {
    public static void main(String[] args) {
        int num1 = 60,num2 = 40;
        System.out.println(num1<num2);//false
        System.out.println(num1>num2);//true
        System.out.println(num1<=num2);//false
        System.out.println(num1>=num2);//true
        System.out.println(num1==num2);//false
        System.out.println(num1!=num2);//true

        System.out.println(num1<num2 || num1>num2);//true
        System.out.println(num1<num2 && num1>num2);//false
        System.out.println(num1<num2 && num1!=num2);//false
    }
}
