package IfElsestatements;

import java.util.Random;

public class task11 {
    public static void main(String[]args){
        Random input = new Random();
        int number = input.nextInt(26);
        number +=65;
        char letter = (char) (number);
        System.out.println("Your letter is "+ letter);

    }
}
