package Class_2;

public class Assignment_Operator {
    public static void main(String[] args) {
        int num1 = 20,num2 = 15;
        int num3;

        num3 = num1; //Assign Operator num3 = 20

        System.out.println(num3);//20

        num1+=20; //num1 = num1 + 20 =40
        System.out.println(num1);//40

        num1-=10 ;//num1 = num1-10
        System.out.println(num1); // 40-10=30

        num1*=20; //num1=num1*20
        System.out.println(num1);//30*20=600

        num3*=10; //num3= num3*10;
        System.out.println(num3);//20*10=200

        num1/=10; //num1= num1/10
        System.out.println(num1); //600/10=60

        num1%=7; //num1 = num1%7
        System.out.println(num1); //60%7=4

    }
}
