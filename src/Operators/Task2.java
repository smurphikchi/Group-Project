package Operators;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int one = input.nextInt();
      int two = input.nextInt();
       int count = 0;
       count++;
       System.out.println(one+two+" "+count);
       one+=two;
       count++;
       System.out.println(one+ two+" "+count);
       one +=two;
       count++;
       System.out.println(one+ two+ " "+ count);




    }

}
