package IfElsestatements;

import java.util.Scanner;

public class Task2 {
    public static void main(String[ ]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height: ");
        double height = input.nextDouble();
        System.out.println("input weight in pounds");
        double weight = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("your BMI is: "+ BMI);
        if (BMI <= 18.5 || BMI >=1 ){
            System.out.println("your BMI is : Underwight!");
            if (BMI >18.5 || BMI <= 25 ) {
                System.out.println("Your BMI is : normal weight.");
                if ( BMI >= 26 || BMI < 30 ) {
                System.out.println("Your BMI is : overweight");
                if (BMI >= 30 ){
                    System.out.println("obes");

                }

                }
            }
        }

    }
}
