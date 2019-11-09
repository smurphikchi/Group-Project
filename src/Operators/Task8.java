package Operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int change,remain, quarter, dimes, nickles,pennies;
         change = input.nextInt();
         remain=change;

         quarter= change /25;
         remain=remain %25;

         dimes=remain / 10;
       int   remain1 = remain %10;

       nickles = remain1 /5;
       int remain2 =remain1%5;
        pennies=remain2;


        System.out.println(quarter);
        System.out.println(nickles);
        System.out.println(dimes);
        System.out.println(pennies);




    }
}
