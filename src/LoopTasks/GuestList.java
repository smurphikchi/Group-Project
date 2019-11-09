package LoopTasks;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean check = true;
        int count = 0;
        String answer, name, totalGuest;

//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
        // for (int i = 0; ; i++) {

            do {
                System.out.println("What is name of the guest");
                name = input.nextLine();
                totalGuest = name;

                System.out.println("Do you want to enter one more guest yes/no");
                answer = input.nextLine();

                // System.out.println(name+i);
            } while (answer.equalsIgnoreCase("yes"));
            check = true;
            totalGuest += ", " + name;

            System.out.println("Guest's list: " + totalGuest);



        }

        }













