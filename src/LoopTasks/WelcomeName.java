package LoopTasks;

import java.util.Scanner;

public class WelcomeName {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=input.nextLine();

        for (int i=0; i<15; i++){
            System.out.println("Welcome "+name);
        }
        System.out.println();

        for (int i=0; i<name.length();i++){
            System.out.println(name.charAt(i)+" for index "+i);
        }
        for (int i = 0; i<5;  i++){
            System.out.println("welcome "+name);
        }
        for (int i = 0; i<name.length();i++){
            System.out.println(name.charAt(i)+" for index "+i);
        }


    }
}
