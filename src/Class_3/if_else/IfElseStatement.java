package Class_3.if_else;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Please Enter Your Number:");
        number=input.nextInt();
        if(number%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
