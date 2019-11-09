package IfElsestatements;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your hour : ");
        int time = input.nextInt();

        if (time >= 8 && time <= 23 ) {
            System.out.println("the campus is open");
        }
        else if ( time < 8 && time >24 )     {
            System.out.println("the campus is closed");
        }
        else {
        System.out.println("you entered invalid hour!");
        }
    }
}
