package IfElsestatements;

import java.util.Scanner;

public class Task12 {
    public  static void main(String[ ]args){
        Scanner input = new Scanner(System.in);
        boolean check;
        int hour = input.nextInt();
        if ( hour >= 8 && hour <= 23){
            check = true;
            System.out.println(" the campus is open");
        }
        else {
            if (hour < 8 &&  hour >= 24){
                check=false;
                System.out.println("the campus is closed");
            }
        }

    }
}
