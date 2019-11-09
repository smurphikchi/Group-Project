package IfElsestatements;

import java.util.Scanner;

public class Task13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        boolean check = true;

        if  (age >=30  && age < 100) {
            System.out.println("Welcome to the building ");
        }
            if ( age == 0 ) {
                System.out.println("Print valid age");
            }
                if (age < 30 || age > 0 ) {
                    System.out.println("Sorry try again when youre 30");

                }





    }
}
