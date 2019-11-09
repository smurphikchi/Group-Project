package IfElsestatements;

import java.util.Scanner;

public class TaskSwitch {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a two double numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Please choose operator from: +,-,/,* ");
        char operator = input.next().charAt(0);
        boolean check = true;
        double plus,minus,multi,divide;
        plus = num1 + num2;
        minus = num1-num2;
        multi = num1* num2;
        divide = num1/num2;

        switch (operator)  {
            case '+':
                System.out.println(num1 + " + " + num2+ " = " + plus);
                break;
            case '-':
                System.out.println(num1 + " - " + num2+ " = "+ minus );
                break;
            case '*':
                System.out.println(num1+ " * " + num2 +" = "+ multi );
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = "+ divide);
            default:



        }

    }

}
