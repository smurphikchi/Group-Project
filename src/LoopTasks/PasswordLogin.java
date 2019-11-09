package LoopTasks;

import java.util.Scanner;

public class PasswordLogin {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        String passwd="secret12345";
        int attempts=0;

        for (;;attempts++){
            if (attempts==3){
                System.out.println("Your account is locked");
                break;

            }System.out.println("Please enter password");
            String user=input.nextLine();
            if (passwd.equalsIgnoreCase(user)){
                System.out.println("Welcome to your frofile");
                break;
            }

        }
    }
}
