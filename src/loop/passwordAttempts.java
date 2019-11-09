package loop;

import java.util.Scanner;

public class passwordAttempts {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String pass = "1234";


        for (int i=0; i<3; i++ ){

            String login = input.nextLine();
            if (login.equals(pass)){

                System.out.println("welcome to your profile");
            }
        }


        }
    }

