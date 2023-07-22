package Class_3.if_else;

import java.util.Scanner;

public class IfElseIfLadder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Please Enter Your Number:");
       num = input.nextInt();

       if(num>=80 && num<=100){
           System.out.println("A+");
       }
       else if (num>=70 && num<=79){
           System.out.println("A");
       }
       else if (num>=60 && num<=69){
           System.out.println("A-");
       }
       else if (num>=50 && num<=59){
           System.out.println("B+");
       }
       else if (num>=40 && num<=49){
           System.out.println("C");
       }
       else {
           System.out.println("Fail");
       }

    }
}
