package IfElsestatements;

import java.util.Scanner;

public class Statement3 {
    public static  void  main(String[]args){
        Scanner input = new Scanner(System.in);
        int passCode = 4321;
        int pass1 = input.nextInt();


         if (pass1 ==passCode) {
             System.out.println("Welcome to Iphone");
         }
         else if (passCode > pass1) {
             System.out.println("Enter 4 digit number");
         }
         else if ( passCode< pass1) {
             System.out.println("you entered less digits");
         }
        else {
            System.out.println("Try again");
         }

    }
}
