package IfElsestatements;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
//        Ask user to enter a new password.
//        If the password does not match any of the requirements below,
//        print a message based on what requirement it is breaking.
//        If it does not break any requirement, print ‘Password accepted’.
//        Password requirements:
//        Be a minimum of eight (8) characters in length
//        Contain at least one uppercase letter (A-Z)
//        Contain at least one lowercase letter (a-z)
//        Contain at least one digit (0-1-2-3-4-5-6-7-8-9)
//        Contain at least one special character (~`!@#$%^&*()+=_-{}[]\|:;”’?/<>,.)


        Scanner input = new Scanner(System.in);
        String passwd = input.nextLine();
        boolean valid = true;
        if (passwd.length() < 8) {
            System.out.println("Password should be more than 8 characters in length.");
            valid = false;
        }


        String upperCaseChars = "(.*[A-Z].*)";
        if (!passwd.matches(upperCaseChars)) {
            System.out.println("Password should contain at least one upper case alphabet");
            valid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!passwd.matches(lowerCaseChars)) {
            System.out.println("Password should contain atleast one lower case alphabet");
            valid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!passwd.matches(numbers)) {
            System.out.println("Password should contain atleast one number.");
            valid = false;
        }
        String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
        if (!passwd.matches(specialChars)) {
            System.out.println("Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-}]{|:[;”’?/<>,. ");
            valid = false;
        }
        if (valid) {
            System.out.println("Password is valid.");
        }
    }










}