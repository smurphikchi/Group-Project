package IfElsestatements;

import java.util.Scanner;

public class Statement7 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
         input.nextLine();
         System.out.println("Please choose one of the operators; +,-,*,/");
        String operators = input.nextLine();
        if (operators.equals("+")) {
            System.out.println(num1+num2);
        }
        else if (operators.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (operators.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (operators.equals("/")) {
            System.out.println(num1 / num2);
        }

        }






    }

