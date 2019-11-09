package IfElsestatements;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int babies = input.nextInt();

        switch (babies) {
            case 0:
                System.out.println("Sorry.");
                break;

            case 1:
                System.out.println("Oh,good!");
                break;
            case 2:
                System.out.println("wow,twins?");
                break;
            case 3:
                System.out.println("triplets?");
                break;
            case 4:
            case 5:
                System.out.println("unbelivable: "+ babies + " babies?");
        }

    }
}
