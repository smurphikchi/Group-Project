package Methods;

import java.util.Scanner;

public class UserPasswd {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your username");
        String username = "Mikasun";
        String passwd = "12345";

        String user = input.nextLine();
        String pass = input.nextLine();


        if (user.equals(username)){
            if (pass.equals(passwd)) {
                System.out.println("success");
            }  else  {
                    System.out.println("Wrong password");

            }
        }
        else {
            System.out.println("Wrong username");
        }
    }}
