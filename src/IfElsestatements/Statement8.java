package IfElsestatements;

import java.util.Scanner;

public class Statement8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "mikasun";
        String passwd = "1993";

        System.out.println("Please enter your username: ");
        String user = input.nextLine();

        if (user.equals(username)) {
            System.out.println("Please enter your passwd: ");
            String password = input.nextLine();
            if (password.equals(passwd)) {
                System.out.println("login successfull!");
            }

            }
            else {
                System.out.println("invalid input");
            }

        }

    }