package IfElsestatements;

import java.util.Scanner;

public class Task6 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        char grade = input.next().charAt(0);

        switch (grade) {
            case 'a':
            case 'A':
                System.out.println("Excellent");
                break;
            case 'b':
            case 'B':
                System.out.println("Great");
                break;
            case 'c':
                System.out.println("Okay");
                break;
            case 'd':
                System.out.println("You can do better");
                break;
            case 'f':
                System.out.println("Something needs to change");
                break;
            default:
                System.out.println("not an invalid grade!");

        }
    }
}
