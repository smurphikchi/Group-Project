package IfElsestatements;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random input = new Random();
        System.out.println("Please quess a number: ");
        int guess = scanner.nextInt();
        int number = input.nextInt(10);

        if (guess == number){
            System.out.println(number);
            System.out.println("congrats");
        }
        else if ( guess > number ){
            System.out.println(number);
            System.out.println("Your guess is too high");
        }
        else if ( guess < number) {
            System.out.println(number);
            System.out.println("low");

        }
        else if ( guess < 0 || guess > 10 ) {
            System.out.println("invalid #");
        }
        else {
            System.out.println("invalid number");
        }

    }
}
