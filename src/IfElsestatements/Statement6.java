package IfElsestatements;

import java.util.Scanner;

public class Statement6 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


        if (num1 > num2 && num1 > num3) {
           System.out.println(num1);
        }
       else if (num2 > num1  && num2 > num3) {
            System.out.println(num2);  //instead of Sout,we can store another container like int = max and use max=num1;
        }
       else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }
       else if (num1 == num2 && num1 == num3) {
            System.out.println("equal");

        }

        }
}
