package Class_3.if_else;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Please Enter Your Letter:");
        ch = input.next().charAt(0);
        if(ch=='a'){
            System.out.println("Vowel");
        }
        else if(ch=='e'){
            System.out.println("Vowel");
        }
        else if(ch=='i'){
            System.out.println("Vowel");
        }
        else if(ch=='o'){
            System.out.println("Vowel");
        }
        else if(ch=='u'){
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonant");
        }

    }
}
