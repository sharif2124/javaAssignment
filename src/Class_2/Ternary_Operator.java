package Class_2;

public class Ternary_Operator {
    public static void main(String[] args) {
        int num1 = 40,num2 = 15;
        int num3;
        String name ;

        num3=num1>num2?num1:num2;
        //num3 = 40>15 ? print 40 because num1 is greater then num2
        System.out.println(num3);
        num3=num1<num2?num1:num2;
        //num3 = 40<15 ? print 15 because num2 is less than num1
        System.out.println(num3);

        name = num1<num2?"Rahim":"Karim";
        //name = 40<15 so print karim because num2 is less than num1
        System.out.println(name);
    }
}
