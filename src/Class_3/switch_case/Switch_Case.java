package Class_3.switch_case;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit;
        System.out.println("Please Enter Your Digit:");
        digit=input.nextInt();
        switch (digit){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("digit not found");

        }

    }
}
