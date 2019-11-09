package LoopTasks;

import java.util.Scanner;

public class ReplItTask2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int  a = 0, b = 0, c = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = scanner.nextInt();
        // System.out.print("Fibonacci Series:");
        for(int i = 1; i <= x; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print( a + " ");
        }






//
//        Given a String, str2 , (str2 may contain characters, numbers and special characters) perform the following conditional actions:
//        Check if str2 has 3 or more characters, if less than 3 or bigger than 100 character, print only Invalid enter
//        Get only numbers from str2 and make one string then print (Hint: use charAt(), ASCII table to verify specific character is number or not number)

    }










}
