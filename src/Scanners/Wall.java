package Scanners;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Wall {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("what is the wall color");
            String color = input.nextLine();
            System.out.println("What is the lenght");
            int lenght = input.nextInt();
            input.nextLine();
            System.out.println("is it good color");
            String answer = input.nextLine();
            System.out.println("color" + color);
            System.out.println("lenght" + lenght);
            System.out.println("good?" + answer);



    }
}
