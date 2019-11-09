package IfElsestatements;

import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
       // Scanner input =new Scanner(System.in);

        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean cond1=n%2!=0;
        boolean cond2=n%2==0 && n>=2 && n<=5;
        boolean cond3=n%2==0 && n>=6;
        boolean cond4=n%2==0 && n>20;


        if (cond1 ) {
            System.out.println("Weird");
        } else  if (cond2) {
                System.out.println("Not Weird");
            }else   if (cond3) {
                    System.out.println("Weird");
                }else if (cond4){
            System.out.println("Not Weird");

        }













//        If  is odd, print Weird
//        If  is even and in the inclusive range of 2 to 5, print Not Weird
//        If  is even and in the inclusive range of 6 to 20, print Weird
//        If  is even and greater than 20 , print Not Weird
    }
}
