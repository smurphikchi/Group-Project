package IfElsestatements;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String fruit = input.nextLine();

        switch (fruit) {
            case "apple":
                System.out.println("oh,you got this.");
                break;
            case " oranges":
                System.out.println("nice!");
                break;
            case "banana":
            case "peach":
                System.out.println("they are my favorite");
                break;

            default:
                System.out.println("that is not a fruit!");


        }
    }
}
