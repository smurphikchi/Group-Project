package Scanners;

import java.util.Scanner;

public class Data {
        public static void main(String[] args) {
                   // String name = "Mika";
                    //String lastname = "Sadykova";
                   // int age =27;
                   // String location = "Chicago, Illinois";
                   // boolean isHeOk =true;
// to import the class in to new
                    Scanner input = new Scanner(System.in);
//that's how you kind of ask guestions
                    System.out.print("What is your name?");
// it will take to a new line,it pauses the execution of the program to input you name.
                    String name =input.nextLine();
//to output, everything
                    System.out.println("Welcome," + name + "!");
                    System.out.println("Where are you from?" + name);
                    String from = input.nextLine();
                    System.out.println(from + "is a cool place");
                    System.out.println(name + " how old are you?");
                    int age = input.nextInt();

                    System.out.println(age + " is fun!");

        }
}
