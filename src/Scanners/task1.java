package Scanners;

import java.util.Scanner;

public class task1 {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Name: ");
        String name = input.nextLine();
       System.out.println("Year: ");
       int age = input.nextInt();
        //System.out.println("Gender: ");
       // char gender = input.nextLine().charAt(0);
        System.out.println("Phone: ");
        long phone = input.nextLong();
        System.out.println("your gpa: ");
        double gpa = input.nextDouble();

        System.out.println(name);
        System.out.println(age);
      //  System.out.println(gender);
        System.out.println(phone);
        System.out.println(gpa);





    }

}

